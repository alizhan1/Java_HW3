package space.harbour.java.hw3;

import space.harbour.java.hw3.MyHashMap;

public class Playground {

    public static class ThreadOne extends Thread {
        @Override
        public void run() {
            System.out.println("Thread One!");
        }
    }

    public static class ThreadTwo extends Thread {
        @Override
        public void run() {
            System.out.println("Thread Two!");
        }
    }
    public static void main(String[] args) {
        Thread t1 = new ThreadOne();
        Thread t2 = new ThreadTwo();
        t1.start();
        t2.start();
    }

}
