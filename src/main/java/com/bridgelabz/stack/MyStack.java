package com.bridgelabz.stack;

public class MyStack {
    static SinglyLinkedList list=new SinglyLinkedList();

    <E extends Comparable>void push(E data){
        list.addFirst(data);
    }

    public void display() {
        list.display();
    }
}
