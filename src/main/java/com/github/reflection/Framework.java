package com.github.reflection;

import org.reflections.Reflections;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Framework {
    private Map<Class<?>, ?> map;

    public Framework(Class<?> mainClass) throws Exception {
        map = processConfigBean(mainClass);
        init(mainClass);
    }

    public <T> T get(Class<T> type) {
        return (T) map.get(type);
    }

    private  <T> void init(Class<T> aClass) throws Exception {
        Set<Class<?>> componentClass = new Reflections(aClass.getPackage().getName()).getTypesAnnotatedWith(Component.class);
        for (Class<?> component : componentClass) {
            map.put(component, getTypeInstance(component));
        }
    }

    private Map<Class<?>, Object> processConfigBean(Class<?> mainClass) throws Exception {
        Map<Class<?>, Object> map = new HashMap<>();
        Set<Class<?>> classes = new Reflections(mainClass.getPackage().getName()).getTypesAnnotatedWith(Configuration.class);
        for (Class<?> aClass : classes) {
            Object configObject = aClass.newInstance();
            for (Method method : aClass.getDeclaredMethods()) {
                Annotation annotation = method.getDeclaredAnnotation(Bean.class);
                if (annotation != null) {
                    Object value = method.invoke(configObject);
                    map.put(method.getReturnType(), value);
                }
            }
        }
        return map;
    }

    private <T> T getTypeInstance(Class<?> aClass) throws Exception {
        Component componentAnnotation = aClass.getAnnotation(Component.class);
        if (componentAnnotation == null) {
            System.out.println("Failed create object " + aClass + " annotate with @Component");
            throw new IllegalStateException("Failed to create instance of type " + aClass);
        }
        for (Constructor<?> constructor : aClass.getDeclaredConstructors()) {
            Annotation annotation = constructor.getAnnotation(Autowired.class);
            if (annotation == null) {
                continue;
            }
            Class<?>[] parameterTypes = constructor.getParameterTypes();
            Object[] args = new Object[parameterTypes.length];
            for (int i = 0; i < parameterTypes.length; i++) {
                if (map.containsKey(parameterTypes[i])) {
                    args[i] = map.get(parameterTypes[i]);
                } else {
                    args[i] = getTypeInstance(parameterTypes[i]);
                }
            }
            return (T) constructor.newInstance(args);
        }
        throw new IllegalStateException("Failed to create instance of type " + aClass);
    }
}
