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
public class Task implements Runnable {
    String name;    
    Task(String s) {
        name = s;        
    }
    @Override
    public void run() {
        for (int i=0; i<5; i++) {
            System.out.println(name + " " + "is working ." );
            //Thread.yield();
        }
    }
}
