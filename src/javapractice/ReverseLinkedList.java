package javapractice;

import java.util.Stack;

/**
 *
 * @author IswaryaParupudi
 */
public class ReverseLinkedList {

    public LinkNode stackImplementation(LinkNode linkedList) {
        Stack<LinkNode> stack = new Stack<>();
        LinkNode tempNode = linkedList;
        while (tempNode != null) {
            stack.push(tempNode);
            tempNode = tempNode.next;
        }
        tempNode = stack.pop();
        linkedList = tempNode;
        while (!stack.empty()) {

            tempNode.next = stack.pop();
            tempNode = tempNode.next;
        }
        tempNode.next = null;

        return linkedList;
    }

    public LinkNode iteratorMethod(LinkNode node) {
        LinkNode prev = null;
        LinkNode current = node;
        LinkNode next = null;

        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        node = prev;

        return node;

    }
    
    public LinkNode stack(LinkNode linkedList){
        Stack<LinkNode> stack = new Stack();
        LinkNode tempNode = linkedList;
        
        while(tempNode != null){
            stack.push(tempNode);
            tempNode = tempNode.next;
        }
        
        tempNode = stack.pop();
        linkedList = tempNode;
        
        while(!stack.isEmpty()){
            tempNode.next = stack.pop();
            tempNode = tempNode.next;
        }
        tempNode.next = null;
        
        return linkedList;
    }

    public static void main(String args[]) {
        ReverseLinkedList reverseLinkedList = new ReverseLinkedList();
        
        System.out.println("Iterator Method");

        LinkNode linkNode = new LinkNode(10);
        linkNode.next = new LinkNode(20);
        linkNode.next.next = new LinkNode(30);
        linkNode.next.next.next = new LinkNode(40);
        linkNode.print(linkNode);

        LinkNode reversedLinkedList = reverseLinkedList.iteratorMethod(linkNode);
        System.out.println();
        linkNode.print(reversedLinkedList);
        System.out.println();
       
        System.out.println("---------------");
       
        System.out.println("Stack implementation Method");

        LinkNode linkNode1 = new LinkNode(10);
        linkNode1.next = new LinkNode(20);
        linkNode1.next.next = new LinkNode(30);
        linkNode1.next.next.next = new LinkNode(40);
        linkNode1.print(linkNode1);

        LinkNode reversedLinkedList1 = reverseLinkedList.stack(linkNode1);
        System.out.println();
        linkNode1.print(reversedLinkedList1);
    }

}
