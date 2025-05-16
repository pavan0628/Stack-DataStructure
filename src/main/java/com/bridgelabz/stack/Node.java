package com.bridgelabz.stack;

public class Node<E extends Comparable<E>> {

    E data;
    Node<E> next;

    Node(E data){
        this.data=data;
    }
}
