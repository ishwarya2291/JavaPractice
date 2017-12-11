package october;

import java.util.ArrayList;

public class ProblemThree {

    public static void main(String args[]) {
        ProblemThree problemThree = new ProblemThree();
        ArrayList arrayList = new ArrayList();
        Integer[] array1 = {1,2};
        Integer[] array2 = {3,4};
        arrayList.add(array1);
        arrayList.add(array2);
        problemThree.findCombinations(arrayList);
        System.out.println("----------");
        
    }

    void findCombinations(ArrayList inputArray) {
        
    }
}

/*
PROBLEM: Combinations from n arrays picking one element from each array
http://www.geeksforgeeks.org/combinations-from-n-arrays-picking-one-element-from-each-array/
Given a list of arrays, find all combinations where each combination contains one element from each given array.
Input : [ [1, 2], [3, 4] ]
Output : 1 3  
         1 4 
         2 3 
         2 4       

Input : [ [1], [2, 3, 4], [5] ]
Output : 1 2 5  
         1 3 5
         1 4 5   
*/
