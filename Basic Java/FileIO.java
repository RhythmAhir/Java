/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package summer16;

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author Rajesh
 */
public class FileIO {
    public static void main(String[] args) {
        File fp = new File("D:/Test/", "temp.txt");
        System.out.println(fp.exists());
        System.out.println(fp.isDirectory());
        System.out.println(fp.lastModified());
        Scanner in = null;
        PrintWriter out = null;
        /*
        try {
            in = new Scanner(fp);
        } catch (Exception e) {
            System.out.println(e);            
        }
        System.out.println(in.next());
        */
        
        try {
            out = new PrintWriter("D:/Test/temp.txt");
        } catch (Exception e) {
            System.out.println(e);      
        }
       out.print("Bangladesh");
      // out.flush();
       out.close();
    }
    
}
