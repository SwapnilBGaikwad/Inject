# Inject

## Build status:

[![Build Status](https://github.com/SwapnilBGaikwad/Inject/workflows/InjectBuild/badge.svg)](https://github.com/SwapnilBGaikwad/Inject/actions)

[![codecov](https://codecov.io/gh/SwapnilBGaikwad/Collection/branch/master/graph/badge.svg)](https://codecov.io/gh/SwapnilBGaikwad/Collection)

[![Release](https://jitpack.io/v/SwapnilBGaikwad/Collection.svg)](https://jitpack.io/#SwapnilBGaikwad/Collection)

[![Downloads](https://jitpack.io/v/SwapnilBGaikwad/Collection/month.svg)](https://github.com/SwapnilBGaikwad/Collection/)


## Dependency Injection library<br/>
***Author : Swapnil Gaikwad*** <br />

## <a name="background"></a>Background

**Dependency Injection** is extremely common in Java projects. It is a great tool for managing dependencies required for application classes.
This project help understand how Spring Dependency injection works and remove boiler plat code in the project 
## <a name="howto"></a>How to use Inject in your Project

### In `pom.xml`
**To get a Git project into your build**<br/>
*Step 1. Maven users should add the JitPack repository to your `pom.xml` file*

```xml
<repositories>
	<repository>
	    <id>jitpack.io</id>
	    <url>https://jitpack.io</url>
	</repository>
</repositories>
```
*Step 2. Add the dependency*

```xml
	<dependency>
	    <groupId>com.github.SwapnilBGaikwad</groupId>
	    <artifactId>Inject</artifactId>
	    <version>1.0</version>
	</dependency>
```

### In `build.gradle`
*Step 1. Gradle users should add the JitPack repository to your `build.gradle` file*

```groovy
allprojects {
	repositories {
		maven { url 'https://jitpack.io' }
	}
}
```
*Step 2. Add the dependency*
```groovy
dependencies {
        compile 'com.github.SwapnilBGaikwad:Inject:1.0'
}
```
### <a name="Current stage"></a>Currently supported functionality<br>
    * Single level package classes support
    * Create beans for basic and custom classes
    * Create object from class annotated with @Component

## Contributing

If have any doubts or found bug create issue on github repo.
* [Write an issue.](https://github.com/SwapnilBGaikwad/Inject/issues/new)
You can contribute by creating pull request.
* Create a pull request. (See [Understanding the GitHub Flow](https://guides.github.com/introduction/flow/index.html)
