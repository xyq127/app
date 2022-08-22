package com.app;

import com.app.entity.Training;
import com.app.entity.Volunteer;
import com.app.mapper.ActivityMapper;
import com.app.mapper.TrainingMapper;
import com.app.mapper.VolunteerMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.mapping.StatementType;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

import java.time.LocalDateTime;
import java.util.*;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

@SpringBootTest
public class ProcedureTest {

    @Autowired
    ActivityMapper activityMapper;



    @Test
    public void procAddActivity()
    {
//        DataConnection dataConnection = new DataConnection();
//        SqlSession sqlSession = dataConnection.getSqlSession();
//        //新增的用户对象
//        User user = new User();
//        user.setUserName("pan_junbiao的博客");
//        user.setSex("男");
//        //调用存储过程执行新增
//        int reuslt = sqlSession.insert("test.proc_add_user",user);
//        sqlSession.commit();
//        //打印结果
//        System.out.println("执行结果："+reuslt);
//        System.out.println("自增主键："+user.getId());
//        sqlSession.close();

        Map<String, String> map = new HashMap<>();
        map.put("activityName","连接测试");
        map.put("activityDetail","连接测试");
//        map.put("activityBegintime","2022-09-09");
//        map.put("activityEndtime","2022-09-10");
        map.put("activityLocation","连接测试");
//        map.put("activityNeedpeople","3");
        map.put("activityNotice","连接测试");
//        map.put("activitySignddl","2022-09-08");
        activityMapper.demo_proc_add_activity(map);
        System.out.println("execute="+map.get("msg"));


    }


    @Test
    public void procSelect()
    {
        Map<String, Object> map = new HashMap<>();
        map.put("organizationId","org_10");
        activityMapper.demo_select(map);
//        System.out.println("该组织申报过的活动"+map.get()+"次志愿者活动");
    }

    @Test
    public void test01(String[] args) {
        TimerTask timerTask = new TimerTask() {
            @Override
            public void run() {
                System.out.println("task  run:"+ new Date());
            }
        };
        Timer timer = new Timer();
        //安排指定的任务在指定的时间开始进行重复的固定延迟执行。这里是每3秒执行一次
        timer.schedule(timerTask,10,3000);
    }

    @Test
    public static void main(String[] args) {
        ScheduledExecutorService service = Executors.newSingleThreadScheduledExecutor();
        // 参数：1、任务体 2、首次执行的延时时间
        //      3、任务执行间隔 4、间隔时间单位
        service.scheduleAtFixedRate(()->System.out.println("task ScheduledExecutorService "+new Date()), 0, 3, TimeUnit.SECONDS);
    }




}
