package com.bridgelabz.linkedlist;


public class SinglyLinkedList<E extends Comparable<E>> {
    Node head;
    Node next;

    public void addFirst(E data){
        Node node = new Node(data);
        Node temp = head;
        this.head = node;
        node.next = temp;
    }
    public void addLast(E data){
        Node node = new Node(data);
        if(this.head == null)
        {
            this.head = node;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = node;
    }

    public int size(){
        int size=1;
        Node temp=head;
        while(temp.next!=null){
            size++;
            temp=temp.next;
        }
        return size;
    }



    public E peak(){
        return (E)head.data;
    }


    public void display(){
        Node temp = this.head;
        if(temp == null) {
            System.out.println("no data in the list,..");
            return;
        }

        while(temp.next!=null)
        {
            Node node = temp;
            System.out.print(node.data+"-->");
            temp = node.next;
        }
        System.out.println(temp.data);
    }


    public void deleteFirst() {
        Node temp=head;
        while(temp!=null){
            System.out.println(temp.data+" Has been poped from stack ");
            head=temp.next;
            temp=temp.next;
        }
    }
}

