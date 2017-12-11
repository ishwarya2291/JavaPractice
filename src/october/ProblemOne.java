package october;

import java.util.Objects;

public class ProblemOne {
    public static void main(String args[]){
        ProblemOne problemOne = new ProblemOne();
        Integer[] array1 = {3, 5, 7, 6, 4, 9, 12, 4, 8};
        System.out.println("solution1: " + problemOne.findNumberOfElementsBetween(array1, 5, 4));
        Integer[] array2 = {4, 6, 8, 3, 6, 2, 8, 9, 4};
        System.out.println("solution2: " + problemOne.findNumberOfElementsBetween(array2, 4, 4));
        Integer[] array3 = {4, 6, 8, 3, 6, 2, 8, 9, 4};
        System.out.println("solution3: " + problemOne.findNumberOfElementsBetween(array3, 4, 10));
    }
    
    Integer findNumberOfElementsBetween(Integer[] inputArray, Integer num1, Integer num2){
        int solution = 0;
        int n = inputArray.length;
        for(int i=0, j=n-1; i<n; i++){
            if(Objects.equals(inputArray[i], num1)){
                while(!Objects.equals(inputArray[j], num2) && j>0){
                    j--;
                }
                solution = (j - i -1<0)? solution: j-i-1;
                break;
            }
        }
        return solution;
    }   
}
/*
 * PROBLEM: Count number of elements between two given elements in array
 * http://www.geeksforgeeks.org/count-number-elements-two-given-elements-array/
 * Given an unsorted array of n elements and also given two points num1 and num2. 
 * The task is to count number of elements occurs between the given points (excluding num1 and num2).
 * If there are multiple occurrences of num1 and num2, we need to consider leftmost occurrence of num1 and rightmost occurrence of num2.
 * Input : arr[] = {3 5 7 6 4 9 12 4 8}
 *         num1 = 5
 *         num2 = 4
 * Output : 5
 * Number of elements between leftmost occurrence of 5 and rightmost occurrence of 4 is five.
 * Input : arr[] = {4, 6, 8, 3, 6, 2, 8, 9, 4}
 *         num1 = 4
 *         num2 = 4
 * Output : 7
 * Input : arr[] = {4, 6, 8, 3, 6, 2, 8, 9, 4}
 *         num1 = 4
 *         num2 = 10
 * Output : 0
 * The solution should traverse array only once in all cases (when single or both elements are not present)
 */