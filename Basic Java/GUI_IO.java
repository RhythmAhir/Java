/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package summer16;

import javax.swing.JOptionPane;

/**
 *
 * @author Rajesh
 */
public class GUI_IO {
    public static void main(String[] args) {
        String s = JOptionPane.showInputDialog("Enter a number");
        int n = (int) Double.parseDouble(s);
        double d = Double.parseDouble(s);
        System.out.println(n + ", " + d);
    }    
}
