package com.github.reflection.config;

import com.github.reflection.Framework;
import org.junit.Assert;
import org.junit.Test;

public class ConfigTest {
    @Test
    public void shouldSetBeansFromConfigMethods() throws Exception {
        Framework framework = new Framework(ConfigTest.class);
        Assert.assertEquals("Hello World", framework.get(String.class));
        Assert.assertEquals(10, framework.get(Integer.class).intValue());
    }
}