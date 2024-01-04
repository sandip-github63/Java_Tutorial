package com.test2;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

class A {
    private int value;

    public A(int value) {
        this.value = value;
       
    }

    public void doSomething() {
        System.out.println("Class A is doing something with value: " + value);
       
    }

  
}



class ObjectPool {
    private static final int MAX_POOL_SIZE_A = 5;
   
    private BlockingQueue<A> poolA;
   

    public ObjectPool() {
        poolA = new LinkedBlockingQueue<>(MAX_POOL_SIZE_A);
      

        // Initialize the pools with some objects
        for (int i = 0; i < MAX_POOL_SIZE_A; i++) {
            poolA.offer(createObjectA(i));
        }

    }

    public A acquireObjectA() {
        try {
            return poolA.take();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            return null;
        }
    }


    public void releaseObjectA(A obj) {
        if (obj != null) {
            // Reset object A state if needed
            poolA.offer(obj);
        }
    }

   

    private A createObjectA(int value) {
        // Create and initialize object A
        return new A(value);
    }

    
}

public class ObjectPoolDP {
    public static void main(String[] args) {
        ObjectPool objectPool = new ObjectPool();

        // Acquire objects from the pool
        A objectA1 = objectPool.acquireObjectA();
      

        // Use the acquired objects
        objectA1.doSomething();
      

        // Release the objects back to the pool when done
        objectPool.releaseObjectA(objectA1);
      
    }
}

