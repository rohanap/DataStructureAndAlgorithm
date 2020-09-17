package com.company.Stacks;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class Expression {

    private final List<Character> lefBracket = Arrays.asList('(','<','[','{');
    private final List<Serializable> rightBracket = Arrays.asList(')','>',']',"}");

    public  boolean isBalanced(String input){
        Stack<Character> stack = new Stack<>();

        for (char ch : input.toCharArray()){
            if(isLeftBracket(ch))
                stack.push(ch);

            if(isRightBracket(ch)) {
                if(stack.empty()) return false;

              var top =  stack.pop();
              if(!bracketsMatch(top,ch))return false;
            }
        }

        return stack.empty();
    }

    private boolean isLeftBracket(char ch){
        return lefBracket.contains(ch);
    }

    private boolean isRightBracket(char ch){
        return rightBracket.contains(ch);
    }

    private boolean bracketsMatch( char left , char right){
      return   lefBracket.indexOf(left) == rightBracket.indexOf(right);

    }
}
