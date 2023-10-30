package com.dinesh.palindromeapp.mystack;

import java.util.ArrayList;
import java.util.List;

public class MystackImpl<T> implements Mystack<T>{

    private int count;
    private List<T> store;


    public MystackImpl(){
        store = new ArrayList<>();
        count = 0;
    }
    @Override
    public void push(T object) {
        store.add(object);
        ++count;
    }

    @Override
    public T pop() {
        int top = store.size();
        T object = store.get(top-1);
        store.remove(top-1);
        return object;
    }

    @Override
    public int size() {
        return count;
    }
}
