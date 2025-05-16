package com.bridgelabz.stack;

public class StackMainClass {

    public static void main(String[] args) {
        MyStack stack=new MyStack();
        stack.push(70);
        stack.push(30);
        stack.push(56);
        stack.push(40);
        stack.display();
        stack.peak();
        stack.pop();
        stack.display();

    }
}
