package com.project.controller;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

@Component
public class DeleteImgController implements ApplicationRunner {

    @Override
    public void run(ApplicationArguments args)throws Exception{
        timerRun();
    }
    //项目启动即运行
    public void timerRun() {
        // 一天的毫秒数
        long daySpan =  300000000;
        // 规定的每天时间09:00:00运行
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd 22:52:00");
        // 首次运行时间
        try {
            Date startTime = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(sdf.format(new Date()));
            // 如果今天的已经过了 首次运行时间就改为明天
            if (System.currentTimeMillis() > startTime.getTime()){
                startTime = new Date(startTime.getTime() + daySpan);
            }
            Timer t = new Timer();
            TimerTask task = new TimerTask() {
                @Override
                public void run() {
                    //业务代码//业务代码//业务代码//业务代码//业务代码//业务代码//业务代码
                    System.out.print("定时器执行");
                    //业务代码//业务代码//业务代码//业务代码//业务代码//业务代码
                }
            };
            // 以每24小时执行一次
            t.schedule(task, startTime, daySpan);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
