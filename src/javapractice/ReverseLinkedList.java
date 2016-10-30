/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javapractice;

import java.util.Stack;

/**
 *
 * @author IswaryaParupudi
 */
public class ReverseLinkedList {
    
    public static LinkNode stackImplementation(LinkNode linkedList){
        Stack<LinkNode> stack = new Stack<>();
        LinkNode tempNode = linkedList;
        while(tempNode != null){
            stack.push(tempNode);
            tempNode = tempNode.next;
        }
        tempNode = stack.pop();
        linkedList = tempNode;
        while(!stack.empty()){          
            
            tempNode.next = stack.pop();
            tempNode = tempNode.next;
        }
        tempNode.next = null;
        
        return linkedList;
    }
    
    public static void main(String args[]){
        LinkNode linkNode = new LinkNode(10);
       
        linkNode.next = new LinkNode(20);
        linkNode.next.next = new LinkNode(30);
        linkNode.next.next.next = new LinkNode(40);
        
        LinkNode reversedLinkedList = stackImplementation(linkNode);
        System.out.println("Done");
    }
    
}
