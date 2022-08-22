package com.app;


import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import javax.xml.crypto.Data;
import java.time.LocalDateTime;

//@Configuration      //1.主要用于标记配置类，兼备Component的效果。
//@EnableScheduling   // 2.开启定时任务

@Component
@EnableScheduling
public class ScheduleTaskTest {

    @Test
    /**默认是fixedDelay 上一次执行完毕时间后执行下一轮*/
    @Scheduled(cron = "0/5 * * * * *")
    public void run() throws InterruptedException {
        Thread.sleep(6000);
        System.out.println(Thread.currentThread().getName()+"=====>>>>>使用cron  {}"+(System.currentTimeMillis()/1000));
    }

    /**fixedRate:上一次开始执行时间点之后5秒再执行*/
    @Scheduled(fixedRate = 5000)
    public void run1()  {
//        Thread.sleep(6000);
        System.out.println(Thread.currentThread().getName()+"=====>>>>>使用fixedRate  {}"+(System.currentTimeMillis()/1000));

    }

    /**fixedDelay:上一次执行完毕时间点之后5秒再执行*/
    @Scheduled(fixedDelay = 5000)
    public void run2() throws InterruptedException {
        Thread.sleep(7000);
        System.out.println(Thread.currentThread().getName()+"=====>>>>>使用fixedDelay  {}"+(System.currentTimeMillis()/1000));
    }


    /**第一次延迟2秒后执行，之后按fixedDelay的规则每5秒执行一次*/
    @Scheduled(initialDelay = 2000, fixedDelay = 5000)
    public static void main(String[] args){
        System.out.println(Thread.currentThread().getName()+"=====>>>>>使用initialDelay  {}"+(System.currentTimeMillis()/1000));
    }


}
