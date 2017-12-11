package october;

import java.util.Arrays;

public class Maths {
    
    public static void main(String args[]){
        Maths maths = new Maths();
        int[] fibonacciSeries = maths.fibonacciSeries(10);
        System.out.println(Arrays.toString(fibonacciSeries));

        int fibonacciSeriesRecursive = maths.fibonacciSeriesRecursive(10, 0, 1);
        System.out.println(fibonacciSeriesRecursive);
    }
    
    int[] fibonacciSeries(int size){
        int[] series = new int[size];
        series[0] = 0;
        series[1] = 1;
        for(int i=2 ; i<size ; i++){
            series[i] = series[i-1] + series[i-2];
        }
        return series;
    }
    
    int fibonacciSeriesRecursive(int size, int num1, int num2){
        
        if(size == 1){
            return 0; 
        }
        if(size == 2){
            return 1;
        }
        
        return fibonacciSeriesRecursive(size-1, num1, num1+num2); 
        
    }
    
}


//String var1 = "xyz";
//String var2 = new String("XYZ");
//
//if(var1==var2){
//    System.out.println(1);
//}
//else{
//    System.out.println(2);
//}
//if(var1.equalsIgnoreCase(var2)){
//    System.out.println(3);
//}
//else{
//    System.out.println(4);
//}
//int[] oldArray = { 3, 5, 7, 9}; 
//int[] newArray = { 2, 4, 6, 8, 9, 7, 5, 3}; 
//System.arraycopy(oldArray, 0, newArray, 0, oldArray.length);
//System.out.println(128 >> 4);


//int x,y=6;
//x = (y<9)?2:1;
//switch(x){
//    case 0: System.out.println(0); break;
//    case 1: System.out.println(1);
//    case 2: System.out.println(2); break;
//    case 3: System.out.println(3); break;
//}

