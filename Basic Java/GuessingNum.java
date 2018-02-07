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
public class GuessingNum {
    public static void main(String[] args) {
        int gen_num = (int) (Math.random()*11);
        Scanner in = new Scanner(System.in);
        System.out.println("Enter another number between 0 and 10");
        int input_num = in.nextInt();
        
        while (gen_num!=input_num) {
            if (input_num>gen_num) System.out.println("The input number too high");
            else System.out.println("The input number too low");
            System.out.println("Enter another number");
            input_num = in.nextInt();
        }
        System.out.println("Congratulations!");
    }
}
