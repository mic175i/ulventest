package com.ulven.test;

import com.ulven.test.invoker.UlvenInvokerFactory;

public class Main {

    public static void main(String[] args) {
        System.out.println("Total memory before start: " + Runtime.getRuntime().totalMemory()/1000000 + "MB");

        UlvenInvokerFactory.getInstance().getInvoker(args).invoke();
    }
}
