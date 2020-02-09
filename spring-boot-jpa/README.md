> By default, Spring Boot enables JPA repository support and looks in the package (and its subpackages) where `@SpringBootApplication` is located. If your configuration has JPA repository interface definitions located in a package that is not visible, you can point out alternate packages by using `@EnableJpaRepositories` and its type-safe `basePackageClasses=MyRepository.class` parameter.

[Accessing Data with JPA][1]

[org.h2.jdbc.JdbcSQLSyntaxErrorException: Sequence "HIBERNATE_SEQUENCE" not found;][2]

[Spring Boot + Spring data JPA][3]

[1]: https://spring.io/guides/gs/accessing-data-jpa/#scratch
[2]: https://stackoverflow.com/a/39808110
[3]: https://mkyong.com/spring-boot/spring-boot-spring-data-jpa/