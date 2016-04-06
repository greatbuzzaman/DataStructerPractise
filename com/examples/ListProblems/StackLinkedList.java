package com.examples.ListProblems;

import java.text.BreakIterator;

public class StackLinkedList<T> implements Stack<T> {
    private int total;
    private Node<T> top;

    public StackLinkedList<T> push(T ele) {
        Node<T> current = top;
        top = new Node<T>(ele);
        top.next = current;
        total++;
        return this;
    }

    public T pop() {
        if (top == null)
            return null;
        T ele = (T) top.data;
        top = top.next;
        total--;
        return ele;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        Node<T> tmp = top;
        while (tmp != null) {
            sb.append(tmp.data).append(", ");
            tmp = tmp.next;
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Stack<String> greeting = new StackLinkedList<>();
        greeting.push("!").push("World").push("Hello");
        System.out.println(greeting.toString());
        System.out.println(greeting.pop());
        System.out.println(greeting.pop() + greeting.pop() + greeting.pop());
    }

    @Override
    public boolean isEmpty() {
        if (top != null)
            return false;
        return true;
    }

    @Override
    public int size() {
        return total;
    }

    @Override
    public T peek() {
        if (top != null){
            return top.data;
        }
        return null;
    }

}
