/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javapractice;

import java.util.Arrays;
import java.util.Enumeration;
import java.util.Hashtable;

/**
 *
 * @author IswaryaParupudi
 */
public class HashFunction {
    
    String[] theArray;
    int arraySize;
    int itemsInArray = 0;
    
    HashFunction(int size){
        arraySize = size;
        theArray = new String[size];
        Arrays.fill(theArray , "-1");
        
    }
    
    public static void main(String[] args){
        Hashtable<String, String> ht = new Hashtable<String, String>();
        ht.put("A", "Apple");
        ht.put("B","Ball");
        ht.put("C", "Cat");
        
        Enumeration alphabets;
        alphabets = ht.keys();
    
    }
    
    
    
}
