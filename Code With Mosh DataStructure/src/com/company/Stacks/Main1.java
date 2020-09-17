package com.company.Stacks;

import java.util.Stack;

public class Main1 {
    public static void main(String[] args) {

        String str = "abcd";

        StringReverser reverser = new StringReverser();
        var res =reverser.reverse(str);
        System.out.println(res);

    }
}
