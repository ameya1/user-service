package org.data.model.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Configuration
@EnableConfigurationProperties
@ConfigurationProperties("event-db")
public class EventLogParams {
    private String driver;
    private String host;
    private Integer port;
    private String user;
    private String password;
    private String database;
    private Integer poolSize;
    private Integer maxIdleTime;
}
