/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mst;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
import java.util.Scanner;

/**
 *
 * @author 18201214
 */

public class MST {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException{
        // TODO code application logic here
          
        File file = new File("input.txt");
        Scanner sc = new Scanner(file);
        String[] cities = null;
        int vertices = ((cities = sc.nextLine().split(" "))).length;
        int G[][] = new int[vertices][vertices];
        
        for(int i =0; i<G[0].length;i++){
            for(int j = 0; j<G[0].length; j++){
                G[i][j] = sc.nextInt();
            }
        }        
   
        int[] parent = MST(G);
        
        
    }
    
   public String getPath(int[]parent, String[] cities, int s){
       
       return 
   }
     
    public static int[] MST(int[][]G){    
         int[] parent = new int [G[0].length];
         PriorityQueue<Key> q = new PriorityQueue<>();
         q.add(new Key(0,0));
         for(int i = 1; i<G[0].length;i++){
             q.add(new Key(i,Double.POSITIVE_INFINITY));
         }
        while(!q.isEmpty()){
            Key u = q.remove();
            for(int v = 0; v<G[u.vertexIndex].length;v++){
                if(G[u.vertexIndex][v]>0){
                    
                    Key k = new Key(v,G[u.vertexIndex][v]);
                         for (Key k1 : q) {
                         if(k1.vertexIndex == k.vertexIndex){
                             if(k1.compareTo(k)== 1){
                                 q.remove(k1);
                                 q.add(k);
                                 parent[v] = u.vertexIndex;
                                 break;
                             }
                         
                         }
                        }                    
              
              }
           }           
        }
    return parent;    
    }

   
}
