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
public class QuickSort {
    private int[] numbers;
    private int number;
    
    public void sort(int[] values){
        if(values==null || values.length == 0){
            return;
        }
        this.numbers = values;
        number = values.length;
        quicksort(0,number-1);
    }
    
    private void quicksort(int low, int high){
        int i=low, j=high;
        int pivot = numbers[low+(high-low)/2];
        
        //Divide into two lists
        while(i<=j){
            while(numbers[i]<pivot){
                i++;
            }
            while(numbers[j]>pivot){
                j--;
            }
            if(i<=j){
                swap(i,j);
                i++;
                j--;
            }
        }
        
        //Recursion
        if(low<j){
            quicksort(low, j);
        }
        if(i<high){
            quicksort(i, high);
        }      
    }
    
    private void swap(int a, int b)
    {
        a = a + b;
        a = a - b;
        b = a - b;
    }    
    
    public static void main(String args[]){
        QuickSort qSort = new QuickSort();
    }
}
