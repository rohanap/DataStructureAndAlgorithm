package com.company.Arrays;



public class Main1 {
    public static void main(String[] args) {
       Array1 numArray = new Array1(3);
       numArray.insert(10);
       numArray.insert(20);
        numArray.insert(30);
        numArray.insert(40);
        //numArray.removAt(4);
        System.out.println(numArray.indexOf(200));
       numArray.print();

    }
}
