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
public class BMI_Calc {
    public static void main(String[] args) {
        String s = JOptionPane.showInputDialog("Enter the weight in kg");
        double weight = Double.parseDouble(s);
        
        s = JOptionPane.showInputDialog("Enter the height in meter");
        double height = Double.parseDouble(s);
        
        double bmi = weight / (height*height);
        
        if (bmi > 30) s = "Seriously overweight";
        else if (bmi>24) s = "Overweight";
        else if (bmi>18) s = "Normal weight";
        else s = "Under weight";
        
        JOptionPane.showMessageDialog(null, "BMI Index = " + ((int) (bmi*100))/100.0 + "  " + s);
        
    }
}
