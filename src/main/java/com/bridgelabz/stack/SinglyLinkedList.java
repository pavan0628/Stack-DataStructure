package com.bridgelabz.stack;


import java.util.Collection;
import java.util.List;

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
    public void insertInBetween(E data){
        if(head == null)
        {
            System.out.println("no data in list");
            return;
        }
        Node node = new Node(data);
        Node temp = head;
        for(int i=1;i<this.size()/2;i++)
        {
            temp = temp.next;
        }
        node.next = temp.next;
        temp.next = node;
    }
    public void pop(){
        if(head==null){
            System.out.println("The list is empty");
        }
        Node temp=head;
        head=temp.next;
    }

    public void popLast(){
        if(head==null){
            System.out.println("the list is empty");
        }
        Node temp=head;
        Node previous=head;
        while(temp.next!=null){
            previous=temp;
            temp=temp.next;
        }
        previous.next=null;
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
    public boolean search(E data) {
        Node<E> temp = head;
        while (temp != null) {
            if (temp.data.equals(data))
                return true;
            temp = temp.next;
        }
        return false;
    }

    public boolean insertDataAfterGivenKey(E key,E searchData){
        Node n=new Node(key);
        Node temp=head;
        boolean found=false;
        while(temp.next!=null){
            if(temp.data==searchData){
                found=true;
                break;
            }
            temp=temp.next;
        }
        Node prev=temp.next;
        temp.next=n;
        n.next=prev;
        return found;
    }
    public boolean deleteData(E data){
        Node temp=head;
        Node prev=temp;
        boolean isDeleted=false;
        while(temp.next!=null){

            if(temp.data==data){
                isDeleted=true;
                break;
            }
            prev=temp;
            temp=temp.next;
        }
        prev.next=temp.next;
        return isDeleted;
    }
    void  sort(){
        Node temp=head;
        for(int i=0;i<size();i++){
            while(temp.next!=null){

                if(temp.data.compareTo(temp.next.data)>0){
                    Comparable swap = temp.data;
                    temp.data = temp.next.data;
                    temp.next.data = swap;

                }

                temp=temp.next;
            }
        }


    }
    E peak(){
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

