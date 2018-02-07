/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package summer16;

/**
 *
 * @author Rajesh
 */
public class Primality {
    public static void main(String[] args) {
        int n;               
        
       for (n=100; n<=200; n++) { 
                    boolean isPrime = true;
                    int m = (int) Math.sqrt(n);
                    if (n==1) isPrime = false;
                    else {
                        for (int i=2; i<=m; i++) {
                            if (n%i==0) {
                                isPrime = false;
                                break;
                            }
                        }
                    }
                    if (isPrime) System.out.println(n + " is Prime");
       }
    }
}
