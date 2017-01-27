package com.kafka.example.config;

import com.datastax.driver.core.Cluster;
import com.datastax.driver.core.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PreDestroy;

/**
 * Created by creyate on 27/01/17.
 */
@Configuration
@ComponentScan(basePackages = {"com.kafka.example.config"}, lazyInit = true)
public class CassandraConfig {
    @Autowired
    private AppConfig appConfig;

    @Bean
    public Session getCassandraSession() {
        Cluster cluster = Cluster.builder()
                .addContactPoint(appConfig.getCassandraHost())
                .withPort(Integer.parseInt(appConfig.getCassandraPort()))
                .build();

        return cluster.connect(appConfig.getCassandraKeyspace());
    }

    @Bean
    @Autowired
    @PreDestroy
    public void closeSession(Session session) {
        session.close();
    }
}
