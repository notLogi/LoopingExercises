package com.pluralsight;

public class ForLoop {
    public static void main(String[] args) throws InterruptedException{
        System.out.println("For Loop");
        for(int i = 10; i >= 0; i--){
            if(i == 0){
                System.out.println("Launch");
                break;
            }
            System.out.println(i);
            Thread.sleep(1000);
        }

    }
}
