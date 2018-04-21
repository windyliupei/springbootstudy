package com.honey.windy;

import org.quartz.*;
import org.quartz.impl.StdSchedulerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.honey.windy")
public class Application {

    public static void main(String[] args){
        SpringApplication.run(Application.class, args);

        try {
            quartzSimple();
        } catch (SchedulerException e) {
            e.printStackTrace();
        }
    }

    public static void quartzSimple() throws SchedulerException {

        JobDetail jobDetail = JobBuilder.newJob(HelloJob.class)
                .withIdentity("myJob","group1")
                .build();

        Trigger trigger = TriggerBuilder.newTrigger()
                .withIdentity("myTrigger","group1")
                .withSchedule(SimpleScheduleBuilder
                .simpleSchedule()
                .withIntervalInSeconds(2)
                .repeatForever()).build();


        SchedulerFactory schedulerFactory = new StdSchedulerFactory();
        Scheduler scheduler = schedulerFactory.getScheduler();
        scheduler.start();

        scheduler.scheduleJob(jobDetail,trigger);


    }

}
