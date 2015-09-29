/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javapractice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.TreeSet;

/**
 *
 * @author IswaryaParupudi
 */
public class TestCollections {
    
    public static void main(String[] args){
        //ArrayList implementation
        ArrayList<String> al = new ArrayList<String>();
        ArrayList<String> al2 = new ArrayList<String>();
        al2.add("Icy");
        al2.add("Teja");
        
        
        if(al.isEmpty()){            
            al.add("I like Harry Potter");
            al.add("I also like Xbox games");
            al.addAll(al2);
        }
        
        
        Iterator itr = al.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        
        // TreeSet implementation
        TreeSet ts = new TreeSet();
        ts.add("b");
        ts.add("c");
        ts.add("a");
        ts.add("b");
        ts.add("c");
        
        Iterator itr2 = ts.iterator();
        while(itr2.hasNext()){
            System.out.println(itr2.next());
        }
        
        
        
    }
    
}
