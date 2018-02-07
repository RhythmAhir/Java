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
import javax.swing.*;

public class GUI_01 {
    public static void main(String[] args) {
            JFrame frame = new JFrame("Test Frame");
            
            frame.setSize(400, 300);
            frame.add(new JButton("Java"));
            frame.add(new JButton("OK"));
            frame.setVisible(true);
            //frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      }
  }
