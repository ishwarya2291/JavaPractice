/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javapractice;

import java.util.LinkedList;

/**
 *
 * @author IswaryaParupudi
 */
public class LinkedListStar {

    public static void main(String args[]) {
        LinkedList iList = new LinkedList();
        iList.add(100);
        iList.add(200);
        iList.add(300);
        iList.add(400);
        iList.add(500);

        iList.addFirst(10);
        System.out.println(iList);
        iList.addLast(550);
        System.out.println(iList);

        iList.addLast(10);
        System.out.println(iList);
        System.out.println("First index of 10 is " + iList.indexOf(10));
        System.out.println("Last index of 10 is " + iList.lastIndexOf(10));

        iList.set(3, 30);
        System.out.println(iList);
        
        System.out.println("First element of Linked List is " + iList.getFirst());
        System.out.println("Last element of Linked List is " + iList.getLast());
    }

}
