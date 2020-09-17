package com.company.Stacks;

public class Main2 {
    public static void main(String[] args) {
        String str = "(1 + 2)}";
        Expression exp = new Expression();
        System.out.println(exp.isBalanced(str));
    }
}
