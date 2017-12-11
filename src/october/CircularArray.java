package october;

public class CircularArray {
    //Takes O(n) time and extra space of O(n)
    public void print(char a[], int n, int index){
        //Create an auxillary array with size 2n
        char b[] = new char[2*n];
        
        for(int i=0; i<n; i++){
            b[i] = a[i];
            b[i+n] = a[i];
        }
        
        //Print consecutive characters from position index
        for(int i=index; i<n+index; i++){
            System.out.print(b[i] + " ");
        }
    }
    
    //This approach takes O(n) time and O(1) extra space.
    public void optimalPrint(char a[], int n, int index){
        for(int i=index; i<n+index; i++){
            System.out.print(a[i % n] + " ");
        }
    }
    
    public static void main(String argc[]){
        char[] a = new char[]{ 'A', 'B', 'C', 
                             'D', 'E', 'F' };
        int n = 6;
        CircularArray circularArray = new CircularArray();
        circularArray.print(a, n, 3);
        System.out.println();
        circularArray.optimalPrint(a, n, 3);
    }
}
