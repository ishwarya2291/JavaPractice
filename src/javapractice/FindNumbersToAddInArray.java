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
public class FindNumbersToAddInArray {
    int n=6, i=0, sum=0, count;
    int[] arr;
    
    public FindNumbersToAddInArray(){
        arr = new int[]{1,3};
//        if(arr.length<n){
//            sum = arr[i]+sum;
//            if(sum <= n && arr[i]<n){
//                count = 0;
//            }
//        }
        
        while(true){
            System.out.println("Entering infinite loop "+i);
            i++;
            if(i==10){
                break;
            }
        }
    }
    public static void main(String args[]){
        FindNumbersToAddInArray a = new FindNumbersToAddInArray();
        
    }
    
}
