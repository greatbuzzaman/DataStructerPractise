package com.examples.ListProblems;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class QueueWthStacks<T> {
    private Stack<T> stack1; // back of queue
    private Stack<T> stack2; // front of queue

    public QueueWthStacks() {
        stack1 = new StackLinkedList<>();
        stack2 = new StackLinkedList<>();
    }

    // move all items from stack1 to stack2
    private void moveStack1ToStack2() {
        while (!stack1.isEmpty())
            stack2.push(stack1.pop());
    }

    // is the queue empty?
    public boolean isEmpty() {
        return stack1.isEmpty() && stack2.isEmpty();
    }

    // return the number of items in the queue.
    public int size() {
        return stack1.size() + stack2.size();
    }

    public T peek() {
        if (isEmpty())
            System.out.println("Empty!! Underflow...");
        if (stack2.isEmpty())
            moveStack1ToStack2();
        return stack2.peek();
    }

    // add the item to the queue
    public void enqueue(T item) {
        stack1.push(item);
    }

    // remove and return the item on the queue least recently added
    public T dequeue() {
        if (isEmpty())
            //throw new NoSuchElementException("Queue underflow");
            System.out.println("Empty!! Underflow...");
        if (stack2.isEmpty())
            moveStack1ToStack2();
        return stack2.pop();
    }

    // a test client
    public static void main(String[] args) {
        QueueWthStacks<String> q = new QueueWthStacks<String>();
        Scanner sc = new Scanner(System.in);

        q.enqueue("aman");
        q.enqueue("sharma");
        q.enqueue("am");
        System.out.println("Peek :"+q.peek());
        q.enqueue("an");
        q.enqueue("aa");
        System.out.println("(" + q.size() + " left on queue)");
        System.out.println(q.dequeue() + " ");
        System.out.println("Peek :"+q.peek());
        System.out.println("(" + q.size() + " left on queue)");
        while (!q.isEmpty()){
            System.out.println(q.dequeue() + " ");
        System.out.println("Peek :"+q.peek());}
        /*
         * while (!sc.hasNext()) { String item = sc.next(); if (!item.equals("-")) q.enqueue(item); else if
         * (!q.isEmpty()) System.out.print(q.dequeue() + " "); }
         */
        System.out.println("(" + q.size() + " left on queue)");
    }
}
