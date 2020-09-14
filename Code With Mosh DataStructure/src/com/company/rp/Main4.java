package com.company.rp;

public class Main4 {
    public void great(String[] names){
        // O(n) space
        String[] copy = new String[names.length];

        for(int i = 0; i<names.length; i++){
            System.out.println("Hi "+ names[i]);
        }
    }
}
