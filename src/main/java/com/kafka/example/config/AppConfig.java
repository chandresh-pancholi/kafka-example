package com.kafka.example.config;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

/**
 * Created by creyate on 27/01/17.
 */
@Configuration
@Getter
public class AppConfig {

    @Value("${kafka.topic}")
    private String kafkaTopics;

    @Value("${kafka.url}")
    private String kafkaBrokerUrl;

    @Value("${acks}")
    private int acks;

    @Value("${retries}")
    private int retries;

    @Value("${batch.size}")
    private int batchSize;

    @Value("${linger.ms}")
    private int lingerMS;

    @Value("${buffer.memory}")
    private long bufferMemory;

    @Value("${key.serializer}")
    private String keySerializer;

    @Value("${value.serializer}")
    private String valueSerializer;

    @Value("${zookeeper.connect}")
    private String zookeeperConnect;

    @Value("${group.id}")
    private String groupId;

    @Value("${zookeeper.session.timeout.ms}")
    private String zookeeperSessionTimeOut;

    @Value("${zookeeper.sync.time.ms}")
    private String zookeeperSyncTime;

    @Value("${auto.commit.interval.ms}")
    private String autoCommitInterval;

    @Value("${cassandra.host}")
    private String cassandraHost;

    @Value("${cassandra.port}")
    private String cassandraPort;

    @Value("${cassandra.keyspace}")
    private String cassandraKeyspace;
}
