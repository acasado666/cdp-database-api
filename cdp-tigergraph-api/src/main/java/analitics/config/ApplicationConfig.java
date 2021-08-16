package analitics.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * ApplicationConfig provides an abstraction of Spring Config Properties (application.yaml,
 * Environment Vars, etc.) which are automatically injected here.
 */
@Component
@ConfigurationProperties(prefix = "config")
@Getter
@Setter
public class ApplicationConfig {

    /**
     * Base URL Path to the TigerGraph REST-API (taas-proxy)
     */
    private String graphDbBaseUrl;

    /**
     * Response Cache in Megabytes
     */
    private long cacheMb;

    /**
     * Response Cache TTL
     */
    private long cacheTtl;

    /**
     * Connect timeout in milliseconds to the graphD
     */
    private int graphDbConnectTimeoutMs;

    private long graphDbReadTimeoutMs;

}
