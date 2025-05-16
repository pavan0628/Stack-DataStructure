package com.bridgelabz.queue;

public class QueueMainClass {
    public static void main(String[] args) {
        MyQueue queue=new MyQueue();
        queue.enQueue(56);
        queue.enQueue(30);
        queue.enQueue(70);

        queue.display();
    }

}
