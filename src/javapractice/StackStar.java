/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javapractice;

/**
 *
 * @author IswaryaParupudi
 */
public class StackStar {

    private int maxSize;
    private long[] stackArray;
    private int top;

    public StackStar(int s) {
        maxSize = s;
        stackArray = new long[maxSize];
        top = -1;
    }

    // Inserts element at top of stack
    public void push(long num) {
        stackArray[++top] = num;
    }

    // Remove element from top of stack
    public long pop() {
        return stackArray[top--];
    }

    // Display the top of stack element
    public long peek() {
        return stackArray[top];
    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public boolean isFull() {
        return (top == maxSize - 1);
    }

    public static void main(String args[]) {
        StackStar myStackStar = new StackStar(10);
        myStackStar.push(1);
        myStackStar.push(2);
        myStackStar.push(3);
        myStackStar.push(4);
        myStackStar.push(5);
        myStackStar.push(6);
        myStackStar.push(7);

        while (!myStackStar.isEmpty()) {
            long value = myStackStar.pop();
            System.out.println(value);
        }
    }

}
