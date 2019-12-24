# Spring

## Dependency Injection

Every software application consists of software components that interact, that collaborate and depend on other components to successfully execute a set of tasks. Each software component provides a service to other components, and linking the customer and the provider component is the process known as _Dependency Injection_.

## Application Context

The **application context** is nothing else than a class implementing the Spring interface
`org.springframework.context.ApplicationContext` that needs to be instantiated and the configuration file given as an argument. There are more implementations for the application context provided by Spring, and the one to use depends on the location and the resources containing the configuration. For XML, the class `org.springframework.context.support.ClassPathXmlApplicationContext` is used.

```java
ApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring/application-config.xml"); // creating the context
UserService userService = (UserService)context.get("simpleUserService"); // get the bean to use to invoke the service
User user = new User(); // create user entity
// populate user
userService.save(user); // invoking the save method of the bean
```
> Pivotal Certified Professional Spring Developer Exam - **Iuliana Cosmina**