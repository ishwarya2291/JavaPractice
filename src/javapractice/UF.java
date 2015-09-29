/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javapractice;

import java.io.IOException;
import java.util.Scanner;

/**
 * This class is an example of union-find implementation
 * @author IswaryaParupudi
 */
public class UF {
    // Constructor initializes union-find data structure with N objects (0 to N-1)
    UF(int N){
        
    }
    
    // Add a connectin between p and q
    void union(int p, int q){
        
    }
    
    //Are p & q in the same component?
    boolean connected(int p, int q){
        return true;
    }
    
    // Component identifier for p (0 to N-1)
    int find(int p){
        return p;
    }
    
    // Number of components
    int count(){
        return 0;
    }
    
    public static void main(String[] args) throws IOException{
        int p=0,q=0,N=0;
        Scanner in = new Scanner(System.in);
        N = in.nextInt();
        UF uf = new UF(N);
        
        while(in.hasNext()){
            p = in.nextInt();
            q = in.nextInt();
        }
        
        System.out.println("N = " + N + "p = " + p + "q = " + q);
        
    }
}

