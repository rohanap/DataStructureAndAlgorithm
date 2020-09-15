package com.company.LinkedList;

import java.util.Arrays;

public class Main1 {
    public static void main(String[] args) {
        var list = new LinkedList();
        System.out.println(list.size());
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        list.addLast(40);
        list.addLast(50);
        //list.removeFirst();
        //list.removeLast();
        //list.removeFirst();
        //System.out.println(list.indexOf(20));
        //System.out.println(list.contains(10));
        //System.out.println(list.size());

        //list.reverse();
        //var array = list.toArray();
        //System.out.println(Arrays.toString(array));
        //System.out.println(list.getKthFromTheEnd(2));
        //list.printMiddle(2);
        var list1 = LinkedList.createWithLoop();
        System.out.println(list.hasLoop());


    }

}
