package com.dinesh.palindromeapp.mystack;

public interface Mystack<T> {
    void push(T object);
    T pop();
    int size();
}
