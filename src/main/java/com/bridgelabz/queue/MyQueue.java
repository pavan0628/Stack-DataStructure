package com.bridgelabz.queue;

import com.bridgelabz.linkedlist.SinglyLinkedList;

public class MyQueue {
    static SinglyLinkedList list=new SinglyLinkedList();

    <E extends Comparable>void enQueue(E data){
        list.addLast(data);
    }
    void display(){
        list.display();
    }
}
