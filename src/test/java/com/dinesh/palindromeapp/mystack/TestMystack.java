package com.dinesh.palindromeapp.mystack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestMystack {

    private final Mystack<Character> mystack;

    TestMystack(){
        mystack = new MystackImpl<>();
    }
    @Test
    void testpush(){
        mystack.push('a');
        mystack.push('b');
        assertEquals(2, mystack.size());
    }

    @Test
    void testpop(){
        mystack.push('c');
        mystack.push('d');
        assertEquals('d',mystack.pop());
    }
}
