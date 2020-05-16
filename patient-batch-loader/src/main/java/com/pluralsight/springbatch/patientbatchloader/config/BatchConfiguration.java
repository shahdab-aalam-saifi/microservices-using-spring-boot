package com.pluralsight.springbatch.patientbatchloader.config;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;
import org.springframework.batch.core.configuration.annotation.BatchConfigurer;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.batch.core.explore.JobExplorer;
import org.springframework.batch.core.explore.support.JobExplorerFactoryBean;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.batch.core.launch.support.SimpleJobLauncher;
import org.springframework.batch.core.repository.JobRepository;
import org.springframework.batch.core.repository.support.JobRepositoryFactoryBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.transaction.PlatformTransactionManager;

@Component
@EnableBatchProcessing
public class BatchConfiguration implements BatchConfigurer {
    private JobRepository jobRepository;
    private JobExplorer jobExplorer;
    private JobLauncher jobLauncher;

    @Autowired
    @Qualifier("batchTransactionManager")

    private PlatformTransactionManager batchTransactionManager;

    @Autowired
    @Qualifier("batchDataSource")
    private DataSource batchDataSource;

    public BatchConfiguration() {
    }

    public JobRepository getJobRepository() throws Exception {
        return this.jobRepository;
    }

    public PlatformTransactionManager getTransactionManager() throws Exception {
        return this.batchTransactionManager;
    }

    public JobLauncher getJobLauncher() throws Exception {
        return this.jobLauncher;
    }

    public JobExplorer getJobExplorer() throws Exception {
        return this.jobExplorer;
    }

    protected JobLauncher createJobLauncher() throws Exception {
        SimpleJobLauncher jobLauncher = new SimpleJobLauncher();
        jobLauncher.setJobRepository(this.getJobRepository());
        jobLauncher.afterPropertiesSet();
        return jobLauncher;
    }

    protected JobRepository createJobRepository() throws Exception {
        JobRepositoryFactoryBean factory = new JobRepositoryFactoryBean();
        factory.setDataSource(this.batchDataSource);
        factory.setTransactionManager(this.getTransactionManager());
        factory.afterPropertiesSet();
        return factory.getObject();
    }

    @PostConstruct
    public void afterPropertiesSet() throws Exception {
        this.jobRepository = this.createJobRepository();
        JobExplorerFactoryBean factory = new JobExplorerFactoryBean();
        factory.setDataSource(this.batchDataSource);
        factory.afterPropertiesSet();
        this.jobExplorer = factory.getObject();
        this.jobLauncher = this.createJobLauncher();
    }
}
