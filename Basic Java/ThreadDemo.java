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
public class ThreadDemo {
    public static void main(String[] args) {
        System.out.println("Main Thread starts.");
        Task t = new Task("x");
        Task v = new Task("y");
        
        Thread t1 = new Thread(t);
        Thread t2 = new Thread(v);
        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();
        } catch (Exception e) {}
        System.out.println("Main Thread ends.");
    }
    
}
