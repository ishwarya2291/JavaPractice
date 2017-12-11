package october;

import java.util.Arrays;

public class Sort {
    
    public static void main(String args[]){
        Sort sort = new Sort();
        int inputArraySize = 6;
        int[] inputArray1 = new int[]{8,9,1,4,3,6};
        System.out.println(Arrays.toString(inputArray1));
        sort.bubbleSort(inputArray1, inputArraySize);
        System.out.println(Arrays.toString(inputArray1));
        
        int[] inputArray2 = new int[]{8,9,1,4,3,6};
        System.out.println(Arrays.toString(inputArray2));
        sort.bubbleSortOptimized(inputArray2, inputArraySize);
        System.out.println(Arrays.toString(inputArray2));
    }

    void bubbleSort(int[] inputArray, int inputArraySize) {
        for(int i=0; i<inputArraySize-1; i++){
            for(int j=0; j<inputArraySize-i-1; j++){
                if(inputArray[j]>inputArray[j+1]){
                    int temp = inputArray[j];
                    inputArray[j] = inputArray[j+1];
                    inputArray[j+1] = temp;
                }
            }
        }
    }
    
    void bubbleSortOptimized(int[] inputArray, int inputArraySize) {
        boolean swapped;
        for(int i=0; i<inputArraySize-1; i++){
            swapped = false;
            for(int j=0; j<inputArraySize-i-1; j++){
                if(inputArray[j]>inputArray[j+1]){
                    int temp = inputArray[j];
                    inputArray[j] = inputArray[j+1];
                    inputArray[j+1] = temp;
                    swapped = true;
                }
            }
            if(swapped == false){
                break;
            }
        }
    }

}
