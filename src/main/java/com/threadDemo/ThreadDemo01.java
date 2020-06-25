package com.threadDemo;

import sun.applet.Main;

public class ThreadDemo01 {
   
    public static void main(String[] args){
        Thread demo01 = new DemoThread02();
        demo01.start();
        System.out.println("运行了main方法");
    }
}

class DemoThread02 extends Thread{
    @Override
    public void run() {
        System.out.println("运行线程01");
    }
}
