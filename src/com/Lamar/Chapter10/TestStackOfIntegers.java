package com.Lamar.Chapter10;

public class TestStackOfIntegers {
    public static void main(String[] args) {
        StackOfIntegers stack = new StackOfIntegers();

        for(int i = 0; i<10; i++){
            System.out.print(i + " ");
            stack.push(i);
        }

        System.out.println();

        while (!stack.empty()){
            System.out.print(stack.pop() + " ");
        }


    }

}
