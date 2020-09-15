package com.company.Arrays;



public class Main1 {
    public static void main(String[] args) {
       Array1 numArray = new Array1(3);
       numArray.insert(10);
       numArray.insert(20);
        numArray.insert(30);
        numArray.insert(40);
        numArray.insert(50);
        //numArray.removAt(4);
        //System.out.println(numArray.indexOf(200));
        //System.out.println(numArray.max());
        //System.out.println(numArray.intersect());
      // numArray.print();
       //numArray.revers();
       numArray.print();
       numArray.insertAt(60,1);
        numArray.print();

    }
}
