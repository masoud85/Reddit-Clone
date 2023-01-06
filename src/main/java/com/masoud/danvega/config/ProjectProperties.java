package com.masoud.danvega.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("springit")
public class ProjectProperties {

    /**
    * This is our default message
    */
    private String projectPropertiesMsg = "Hello, World!";

    public String getProjectPropertiesMsg() {
        return projectPropertiesMsg;
    }

    public void setProjectPropertiesMsg(String projectPropertiesMsg) {
        this.projectPropertiesMsg = projectPropertiesMsg;
    }
}
