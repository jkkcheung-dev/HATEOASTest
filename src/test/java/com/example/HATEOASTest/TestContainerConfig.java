//package com.example.HATEOASTest;
//
//import org.springframework.boot.test.context.TestConfiguration;
//import org.springframework.context.annotation.Bean;
//import org.testcontainers.containers.PostgreSQLContainer;
//import org.testcontainers.junit.jupiter.Container;
//import org.testcontainers.junit.jupiter.Testcontainers;
//
//@Testcontainers
//@TestConfiguration
//public class TestContainerConfig {
//    @Container
//    private static final PostgreSQLContainer<?> postgres = new PostgreSQLContainer<>("postgres:16-alpine")
//            .withDatabaseName("testdb")
//            .withUsername("testuser")
//            .withPassword("testpass");
//
//    @Bean
//    public void configureDataSourceProperties() {
//        System.setProperty("spring.datasource.url", postgres.getJdbcUrl());
//        System.setProperty("spring.datasource.username", postgres.getUsername());
//        System.setProperty("spring.datasource.password", postgres.getPassword());
//        System.setProperty("spring.jpa.hibernate.ddl-auto", "create-drop");
//    }
//}
