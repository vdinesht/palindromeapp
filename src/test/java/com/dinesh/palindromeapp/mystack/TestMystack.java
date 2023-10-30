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

    @Test
    void testsize(){
        while (mystack.size() != 0) {
            mystack.pop();
        }

        mystack.push('e');
        mystack.push('f');
        mystack.push('g');

        assertEquals(3,mystack.size());
    }

    @Test
    void testpushandpop(){
        mystack.push('d');
        mystack.push('e');
        assertEquals('e', mystack.pop());
    }
}
