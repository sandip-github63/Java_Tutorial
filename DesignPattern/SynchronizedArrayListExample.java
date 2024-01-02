package com.test;

import java.util.ArrayList;
import java.util.List;

public class SynchronizedArrayListExample {
    private List<String> synchronizedList = new ArrayList<>();

    public void addItem(String item) {
        synchronized (synchronizedList) {
            synchronizedList.add(item);
        }
    }

    public String getItem(int index) {
        synchronized (synchronizedList) {
            return synchronizedList.get(index);
        }
    }

  

    public static void main(String[] args) {
        SynchronizedArrayListExample example = new SynchronizedArrayListExample();

        
    }
}

