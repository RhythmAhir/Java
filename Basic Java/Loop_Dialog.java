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
public class Loop_Dialog {
    public static void main(String[] args) {
        int option = JOptionPane.CANCEL_OPTION;
        while (option!=JOptionPane.YES_OPTION) {
            System.out.println("Showing dialog box...." +  JOptionPane.YES_OPTION);
            option = JOptionPane.showConfirmDialog(null, "Continue?");            
        }
    }
}
