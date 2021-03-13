package com.example.configure;

import io.github.cdimascio.dotenv.Dotenv;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class DB {

    @Bean
    public DataSource getDataSource() {
        Dotenv dotenv = Dotenv.load();

        DataSourceBuilder dataSourceBuilder = DataSourceBuilder.create();
        dataSourceBuilder.driverClassName("org.postgresql.Driver");
        dataSourceBuilder.url(dotenv.get("JDBC_DATABASE_URL") + dotenv.get("JDBC_DATABASE"));
        dataSourceBuilder.username(dotenv.get("JDBC_USERNAME"));
        dataSourceBuilder.password(dotenv.get("JDBC_PASSWORD"));
        return dataSourceBuilder.build();
    }
}
