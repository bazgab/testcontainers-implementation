package com.bazgab.testcontainers_implementation.repositories;


import org.springframework.boot.test.autoconfigure.data.jdbc.DataJdbcTest;
import org.testcontainers.containers.GenericContainer;
import org.testcontainers.junit.jupiter.Container;
import org.testcontainers.junit.jupiter.Testcontainers;
import org.testcontainers.utility.DockerImageName;

@Testcontainers
@DataJdbcTest
public class ProductRepositoryTest {

    @Container
    static GenericContainer<?> mysql = new GenericContainer<>(DockerImageName
            .parse("mysql:9.3"))
            .withExposedPorts(6379);


}
