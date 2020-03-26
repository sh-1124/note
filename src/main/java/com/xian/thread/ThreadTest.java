package main.java.com.xian.thread;

import main.java.com.xian.designpattern.singleton.LazyDoubleCheckSingleton;

public class ThreadTest implements Runnable {
        public ThreadTest() {
    }
    @Override
    public void run() {
//        HungrySingleton instance =  HungrySingleton.getInstance();
        LazyDoubleCheckSingleton instance = LazyDoubleCheckSingleton.getInstance();
        System.out.println(Thread.currentThread().getName()+instance);
    }

    public static void main(String[] args) {
        Thread t1 = new Thread(new ThreadTest());
        Thread t2 = new Thread(new ThreadTest());
        t1.start();
        t2.start();
        System.out.println("End");
    }
}
