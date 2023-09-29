/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mainpkg;

import java.util.Random;

/**
 *
 * @author Administrator
 */
public class Matrix {
    int[][] vals;
    String toString;
    
    public void setMatrix(int r,int c){
        vals= new int[r][c];
        int i,j;
        Random rand= new Random();
        for(i=0;i<r;i++){
            for(j=0;j<c;j++)
                vals[i][j]=rand.nextInt(100)+1;  
        }
    }
    public void showMatrix(){    
        int i,j;        
        for(i=0;i<vals.length;i++){
            for(j=0;j<vals[i].length;j++){
                System.out.print(vals[i][j]+" ");            
            }
            System.out.println();
        }
    }

    @Override
    public String toString() {
        int i,j;
        String str="";    
        for(i=0;i<vals.length;i++){
            for(j=0;j<vals[i].length;j++){
                str += (vals[i][j]+" ");            
            }
            str += "\n";
        }
        return str;
    } 


}