# Microservices using Spring Boot

![Microservices using Spring Boot](https://github.com/shahdab-aalam-saifi/microservices-using-spring-boot/workflows/Microservices%20using%20Spring%20Boot/badge.svg)

## Dependency Injection

Every software application consists of software components that interact, that collaborate and depend on other components to successfully execute a set of tasks. Each software component provides a service to other components, and linking the customer and the provider component is the process known as _Dependency Injection_.

## Application Context

The **application context** is nothing else than a class implementing the Spring interface
`org.springframework.context.ApplicationContext` that needs to be instantiated and the configuration file given as an argument. There are more implementations for the application context provided by Spring, and the one to use depends on the location and the resources containing the configuration. For XML, the class `org.springframework.context.support.ClassPathXmlApplicationContext` is used.

```java
ApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring/application-config.xml");
UserService userService = (UserService)context.get("simpleUserService");
User user = new User(); 
...
userService.save(user);
```

## Spring Configuration

For bean definitions to be read and for beans to be created and managed, many Spring-provided beans must be created too. That is why a few core Spring modules must be added as dependencies to your project:
* `spring-core`: fundamental parts of the Spring Framework
* `spring-beans`: together with spring-core provide the core components of the framework, including the Spring IoC and dependency Injection features.
* `spring-context`: expands the functionality of the previous two, and as the name says, it contains components that help build and use an application context. The ApplicationContext interface is part of this module, being the interface that every application context class implements.
* `spring-context-support`: provides support for integration with third-party libraries, for example Guava, Quartz, FreeMarker, and many more.
* `spring-expressions`: provides a powerful Expression Language (SpEL) used for querying and manipulating objects at runtime; for example, properties can be read from external sources decided at runtime and used to initialize beans. But this language is quite powerful, since it also supports logical and mathematical operations, accessing arrays, and manipulating collections.

### Constructor Injection
Constructor injection can be used to define beans when the bean type is a class that has a constructor with arguments defined. If the bean definition looks like this:

```xml
<?xml version="1.0" encoding="UTF-8"?>
<beans xmlns="http://www.springframework.org/schema/beans"
    xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
    xsi:schemaLocation="http://www.springframework.org/schema/beans
        http://www.springframework.org/schema/beans/spring-beans.xsd">
    <bean id="complexBean" class="com.ps.beans.ctr.ComplexBeanImpl">
        <constructor-arg ref="simpleBean"/>
    </bean>
    <bean id="simpleBean" class="com.ps.beans.SimpleBeanImpl"/>
</beans>
```
> Pivotal Certified Professional Spring Developer Exam - **Iuliana Cosmina**

