package service;

import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        // Adding elements in to the Stack
        stack.push(6);
        stack.push(3);
        stack.push(4);
        System.out.println("Stack: " + stack);
        stack.pop();
        stack.pop();
        System.out.println("Stack after removed: "+stack);
    }
}
