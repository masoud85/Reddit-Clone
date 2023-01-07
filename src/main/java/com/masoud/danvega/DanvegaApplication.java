package com.masoud.danvega;

import com.masoud.danvega.config.ProjectProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableConfigurationProperties({ProjectProperties.class})
@EnableJpaAuditing
public class DanvegaApplication {

    public static void main(String[] args) {
        SpringApplication.run(DanvegaApplication.class, args);
    }

}
