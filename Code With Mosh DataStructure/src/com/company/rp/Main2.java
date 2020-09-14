package com.company.rp;

public class Main2 {
    public void log(int[] numInts,String[] strings){
        // O(n)
        for(int nums : numInts) { // O(n)
            System.out.println(nums);
        }
        for(String names : strings) {  // O(m)
            System.out.println(names);
        }
    }
}
