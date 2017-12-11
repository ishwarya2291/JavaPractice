package october;

public class ProblemTwo {

    public static void main(String args[]) {
        ProblemTwo problemTwo = new ProblemTwo();
        Integer[] array1 = {1, 10, 4, 2};
        problemTwo.findPairsWithDifferenceLessThanK(array1, 3);
        System.out.println("----------");
        Integer[] array2 = {1, 8, 7};
        problemTwo.findPairsWithDifferenceLessThanK(array2, 7);
    }

    void findPairsWithDifferenceLessThanK(Integer[] inputArray, Integer k) {
        int counter = 0;
        for(int i=0, j=inputArray.length-1; i<inputArray.length; i++){
            while(j>0 && (Math.abs(inputArray[i]-inputArray[j])) < k && inputArray[i]!=inputArray[j]){
                counter++;
                System.out.println("Pair: (" + inputArray[i] + ", " + inputArray[j] + ")" );
                j--;
            }
        }
        System.out.println("Number of pairs found : " + counter );
    }
}

/*
PROBLEM: Pairs with Difference less than K
http://www.geeksforgeeks.org/pairs-difference-less-k/
Given an array of n integers, We need to find all pairs with difference less than k
Input : a[] = {1, 10, 4, 2}
K = 3
Output : 2
We can make only two pairs
with difference less than 3.
(1, 2) and (4, 2)

Input : a[] = {1, 8, 7}
K = 7
Output : 2

Pairs with difference less than 7
are (1, 7) and (8, 7)*/
