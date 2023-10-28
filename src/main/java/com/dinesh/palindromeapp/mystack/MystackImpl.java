package com.dinesh.palindromeapp.mystack;

public class MystackImpl<T> implements Mystack<T>{

    private int count;
    private T store;

    MystackImpl(){
        count = 0;
    }
    @Override
    public void push(T object) {
        store = object;
        ++count;
    }

    @Override
    public T pop() {
        return store;
    }

    @Override
    public int size() {
        return count;
    }
}
