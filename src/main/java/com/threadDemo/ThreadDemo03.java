package com.threadDemo;

/**
 * start的执行顺序与线程的启动顺序无关
 */
public class ThreadDemo03 {
    public static void main(String[] args) {
        Thread thread1 = new Demo04Thread("1");
        Thread thread2 = new Demo04Thread("2");
        Thread thread3 = new Demo04Thread("3");
        Thread thread4 = new Demo04Thread("4");
        Thread thread5 = new Demo04Thread("5");
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();
    }
}
class Demo04Thread extends Thread{
    private String string;
    public Demo04Thread(String s){
        this.string = s;
    }

    @Override
    public void run() {
        System.out.println("s="+string);
    }
}