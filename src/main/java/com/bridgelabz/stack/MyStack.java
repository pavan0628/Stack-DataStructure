package com.bridgelabz.stack;

import com.bridgelabz.linkedlist.SinglyLinkedList;

public class MyStack {
    static SinglyLinkedList list=new SinglyLinkedList();

    //push into the stack
    <E extends Comparable>void push(E data){
        list.addFirst(data);
    }

    void peak(){
        System.out.println(list.peak());
    }

    public void display() {
        list.display();
    }

    public void pop() {
        list.deleteFirst();
    }
}
