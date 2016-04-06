package com.examples.ListProblems;

public interface Stack <T>{
    Stack<T> push(T ele);
    T pop();
    boolean isEmpty();
    int size();
    T peek();
}
