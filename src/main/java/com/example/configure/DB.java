package com.example.configure;

import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class DB {

    @Bean
    public DataSource getDataSource() {
        System.out.println(System.getenv("JDBC_USERNAME"));

        DataSourceBuilder dataSourceBuilder = DataSourceBuilder.create();
        dataSourceBuilder.driverClassName("org.postgresql.Driver");
        dataSourceBuilder.url(System.getenv("JDBC_DATABASE_URL") + System.getenv("JDBC_DATABASE"));
        dataSourceBuilder.username(System.getenv("JDBC_USERNAME"));
        dataSourceBuilder.password(System.getenv("JDBC_PASSWORD"));
        return dataSourceBuilder.build();
    }
}
