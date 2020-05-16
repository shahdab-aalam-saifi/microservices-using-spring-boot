package com.pluralsight.springbatch.patientbatchloader.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "application", ignoreUnknownFields = false)
public class ApplicationProperties {
    private final ApplicationProperties.Batch batch = new ApplicationProperties.Batch();

    public ApplicationProperties() {
    }

    public ApplicationProperties.Batch getBatch() {
        return this.batch;
    }

    public static class Batch {
        private String inputPath = "D:\\GitHub\\microservices-using-spring-boot\\patient-batch-loader\\data";

        public Batch() {
        }

        public String getInputPath() {
            return this.inputPath;
        }

        public void setInputPath(String inputPath) {
            this.inputPath = inputPath;
        }
    }
}
