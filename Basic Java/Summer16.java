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
public class Summer16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here        
        long total_sec = System.currentTimeMillis()/1000;        
        long total_sec_today = total_sec % (24*3600);
        
                
        int hr = (int) (total_sec_today / 3600);
        int rest_sec = (int) (total_sec % 3600);
        int min = rest_sec / 60;
        int sec  = rest_sec % 60;
        
        System.out.println("Time: " + (hr+6)%24+ ":" + min + ":" + sec);
    }
    
}
