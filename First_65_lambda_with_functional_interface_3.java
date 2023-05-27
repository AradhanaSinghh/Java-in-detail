package com.company;

public class First_65_lambda_with_functional_interface_3 {
    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Creating a new thread..");
            }
        }).start();
    }
}

