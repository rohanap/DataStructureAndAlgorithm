package com.company.Stacks;

public class Main3 {
    public static void main(String[] args) {
           Stack stack = new Stack();
           MinStack m = new MinStack();

           //stack.push(10);
           //stack.push(20);
           //stack.push(30);
           //stack.pop();
           //System.out.println(stack);
        m.push(10);
        m.push(20);
        m.push(1);
        m.push(4);
        //var min = m.min();
        m.pop();
        m.pop();
        var min = m.min();
        System.out.println(min);
    }
}
