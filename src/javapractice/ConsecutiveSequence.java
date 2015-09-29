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
public class ConsecutiveSequence {

     int count = 0;
     int i=0;

    public  int[] findConsecutiveSequence(int[] arr) {
     int len = arr.length-1;
     
        for ( i = 0; i <= len; i++) {
          if(i+1 <= len){
            while (!areConsecutive(arr[i], arr[i + 1])) {
                System.out.println(i);
                System.out.println(arr[i]-count + "-" + arr[i]);
                count=0;
                break;
            }  
          }else{
              while (!areConsecutive(arr[i], arr[i])) {
                System.out.println(i);
                System.out.println(arr[i]-count + "-" + arr[i]);
                count=0;
                break;
            }  
          }
            
            
        }
        return arr;
    }

    public  boolean areConsecutive(int a, int b) {
        if (a - b == 1 || b - a == 1) {
            count++;
            return true;

        }
        return false;
    }

    public static void main(String[] args) {
        ConsecutiveSequence f = new ConsecutiveSequence();
        int[] arr = {1, 2, 3, 10, 25, 26, 30, 31, 32, 33};
        f.findConsecutiveSequence(arr);
    }

}
