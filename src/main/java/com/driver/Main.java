package com.driver;

public class Main {

    public static void main(String[] args) {
        RWOnly obj = new RWOnly();
       // obj.name = " kunal";
        obj.setName("kunal");
        obj.getName();
    }
  
}