package com.masoud.danvega;

import com.masoud.danvega.config.ProjectProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties({ProjectProperties.class})
public class DanvegaApplication {

    public static void main(String[] args) {
        SpringApplication.run(DanvegaApplication.class, args);
    }

}
