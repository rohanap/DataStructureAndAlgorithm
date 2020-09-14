package com.company.rp;

public class Main3 {
    public void log(int[]ints){
        // O(n^2)
        for(int first : ints){ // O(n)
            for(int second : ints){ // O(n)
                System.out.println(first+" "+ second);
            }
        }
    }
}
