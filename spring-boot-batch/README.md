# Creating a Batch Service

> Spring Boot runs `schema-@@platform@@.sql` automatically during startup.
> `-all` is the default for all platforms.

> `chunk()` is prefixed `<Person,Person>` because it is a generic method. This represents the
> input and output types of each "chunk" of processing and lines up with
> `ItemReader<Person>` and `ItemWriter<Person>`.

## References

[Creating a Batch Service][1]

[1]: https://spring.io/guides/gs/batch-processing/