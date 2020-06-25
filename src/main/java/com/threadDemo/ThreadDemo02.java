package com.threadDemo;

import org.springframework.data.redis.core.ScanOptions;

/**
 * 直接调用run方法不是启动线程，而是调用run方法，要用start方法来启动线程
 * start的执行顺序和线程的启动顺序不是一致的
 */
public class ThreadDemo02 {
    public static void main(String[] args){
        try {
            Thread thread = new DemoThread03();
            thread.start();
            for (int i = 0; i <10 ; i++) {
                System.out.println("运行main方法");
                Thread.sleep(100);
            }
             
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        
    }
}

class DemoThread03 extends Thread{
    @Override
    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println("运行run方法");
                Thread.sleep(100);
            }
        }catch (InterruptedException i){
            i.printStackTrace();
        }
    }
}
