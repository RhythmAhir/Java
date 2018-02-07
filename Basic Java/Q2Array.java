/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package summer16;

import java.util.Scanner;

/**
 *
 * @author Rajesh
 */
public class Q2Array {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);        
        int n = input.nextInt();
        
        int[][] list = new int[n][];
        
        for (int i=0; i<list.length; i++) {            
            list[i] = new int[i+1];
        }
        
        for (int i=0; i<list.length; i++) {
            for (int j=0; j<list[i].length; j++) {
                list[i][j] = (int) (10+Math.random()*21);
            }
        }
        
        int max = list[0][0];
        for (int i=0; i<list.length; i++) {
            for (int j=0; j<list[i].length; j++) {
                if (max<list[i][j]) max = list[i][j];
            }
        }
        
    }
}
