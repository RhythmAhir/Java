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
public class ExceptionDemo_01 {
    public static void test() {
        int a = 4, b = 0, c;
        c = a/b;
    }
    public static void main(String[] args) {
        try {
            test();
        } catch (NullPointerException x) {
            System.out.println("Exception occured ... could NOT continue.");
            System.out.println(x.toString());
        } catch (ArrayIndexOutOfBoundsException x) {
            System.out.println(x.toString());
        }
        System.out.println("Dhaka");
    }    
}
