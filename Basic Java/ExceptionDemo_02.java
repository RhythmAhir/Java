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
public class ExceptionDemo_02 {
    public static void test() {
        int a = 4, b = 0, c;
        try { 
            c = a/b;
        }  catch (Exception x) {
            System.out.println("Exception handled in Test Method");
        }
    }
    public static void main(String[] args) {
        test();
         System.out.println("End of Program");
    }    
}