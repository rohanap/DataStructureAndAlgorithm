package com.company.Arrays;

import java.util.Arrays;

public class Array1 {

    private int[] items;
    private int count;

    public Array1(int length) {
        items = new int[length];
    }

    public void insert(int item){
        if(items.length == count){
            int[] newItems = new int[count*2];
            for(int i = 0; i< count; i++){
                newItems[i] = items[i];
            }
            items = newItems;
        }
        items[count++] = item;
    }

    public void insertAt(int item, int index) {
        if (index < 0 || index > count)
            throw new IllegalArgumentException();

        // Note that I've extracted the logic for
        // resizing the array into this private
        // method so we can reuse in insert() and
        // insertAt() methods.
        //
        // This also made our code cleaner and
        // more readable.
        resizeIfRequired();

        for (int i = count - 1; i >= index; i--)
            items[i + 1] = items[i];

        items[index] = item;
        count++;
    }

    private void resizeIfRequired() {
        if (items.length == count) {
            int[] newItems = new int[count * 2];

            for (int i = 0; i < count; i++)
                newItems[i] = items[i];

            items = newItems;
        }
    }

    public void removAt(int index){
        if(index < 0 || index >= count)
            throw new IllegalArgumentException();
        for(int i = index;i<count;i++)
            items[i]=items[i+1];
        count--;
    }

    public int indexOf(int item){
        for(int i = 0;i<count;i++)
            if(items[i]==item)
                return i;
        return -1;
    }

    public int max(){
        int max=items[0];
        for(int i:items){
            if(i>max){
                max=i;
            }
        }
        return max;
    }

    public Array intersect(Array arrays){
       Array ab = new Array(count);

       for(int a:items ){
           if(arrays.indexOf(a)>=0){
               ab.insert(a);
           }

       }
        return ab;
    }

    public void revers(){
        int[] newItems = new int[count];
        for(int i = 0; i < count; i++){
            newItems[i] = items[count - i - 1];

        }
        items=newItems;

    }



    public void print(){
        for(int i = 0; i < count; i++){
            System.out.println(items[i]);
        }
    }
}
