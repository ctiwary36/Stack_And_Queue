package com.stackandqueue;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to Stack and Que Problems");

        Queue queue = new Queue();

        queue.enQueue(56);
        queue.enQueue(30);
        queue.enQueue(70);

        queue.deQueue();

        queue.print();


    }

}

