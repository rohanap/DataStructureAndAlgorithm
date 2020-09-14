package com.company.Arrays;

import java.util.ArrayList;

public class Main2 {
    public static void main(String[] args) {
        // Vector: 100% - synchronized
        // ArrayList: 50% -

        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        System.out.println(list);
    }
}
