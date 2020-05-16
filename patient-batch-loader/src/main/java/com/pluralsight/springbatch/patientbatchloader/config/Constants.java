package com.pluralsight.springbatch.patientbatchloader.config;

public final class Constants {
    public static final String SYSTEM_ACCOUNT = "system";
    public static final String DEFAULT_LANG_KEY = "en";
    public static final String SPRING_PROFILE_DEVELOPMENT = "dev";
    public static final String SPRING_PROFILE_PRODUCTION = "prod";
    public static final String SPRING_PROFILE_NO_LIQUIBASE = "no-liquibase";
    public static final String JOB_NAME = "patient-batch-loader";
    public static final String JOB_PARAM_FILE_NAME = "patient-batch-loader.fileName";
    public static final String STEP_NAME = "process-patients-step";
    public static final String ITEM_READER_NAME = "patient-item-reader";

    private Constants() {
    }
}
