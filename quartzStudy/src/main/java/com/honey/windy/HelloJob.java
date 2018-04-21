package com.honey.windy;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

import java.sql.Timestamp;

public class HelloJob implements Job {
    @Override
    public void execute(JobExecutionContext jobExecutionContext) throws JobExecutionException {
        Timestamp now = new Timestamp(System.currentTimeMillis());
        System.out.println(String.format("Hi it time %S",now));
    }
}
