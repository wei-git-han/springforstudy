package com.project.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DingShiQi {
    public static void main(String[] args) {
        final SimpleDateFormat df = new SimpleDateFormat("HH:mm:ss");
        final long timeInterval = 2000;
//		final long timeInterval = 86400000;
        Runnable runnable = new Runnable() {
            public void run() {
                while (true) {
                    // ------- code for task to run
                    // ------- 要运行的业务代码
                    if ("22:42:00".equals(df.format(new Date()))) {
                        System.out.println("Hello, stranger");
                    }
                    // ------- ends here
                    try {
                        // sleep()：同步延迟数据，并且会阻塞线程
                        Thread.sleep(timeInterval);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };
        // 创建定时器
        Thread thread = new Thread(runnable);
        // 开始执行
        thread.start();


    }
}
