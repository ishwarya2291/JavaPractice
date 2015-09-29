/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javapractice;

import com.sun.org.apache.xalan.internal.xsltc.runtime.Hashtable;

/**
 *
 * @author IswaryaParupudi
 */
public class RemoveDuplicatesInString {
    
    public static String removeDuplicatesandSort(String str){
        int charsCount[] = new int[256];
        
        for(int i=0; i<str.length();i++){
            char ch = str.charAt(i);
            charsCount[ch]++;
        }
        
        
        String sb = new String();
        for(int i=0; i<charsCount.length; i++){
            if(charsCount[i]>0){
                  sb = sb + (char)i;
            }
        }
        
        return sb;
    }
    
    public static String removeDuplicatesAndPreserveOrder(String str){
        
        boolean visited[] = new boolean[256];
        String sb = new String();
        for(int i=0; i<str.length();i++){
            char ch = str.charAt(i);
            if(!visited[ch]){
                visited[ch] = true;
                sb = sb + ch;
            }
        }
        
        return sb;
    }
    
    public static void main(String[] args){
        String inputString = "cbacdcdc";
        String outputString;
        outputString = removeDuplicatesandSort(inputString);
        System.out.println("Output after sorting: " +outputString);
        
        outputString = removeDuplicatesAndPreserveOrder(inputString);
        
        System.out.println("Output without sorting: " +outputString);
    }
    
}
