package com.fatehistory.patrickjmartin.fatehistory.Storage;

import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.Stack;

public class HistoryStack<T> {
    private int maxSize = 5;
    private ArrayList<T> stack = new ArrayList<T>();
    private int top = 0;

    public int size() {return top;}

    public void push(T item) {
        if((top + 1) == maxSize) {

        }
    }


}
