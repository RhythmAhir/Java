/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package summer16;

import java.util.Random;

/**
 *
 * @author Rajesh
 */
public class TestDemo {
    public static void main(String[] args) {
        StudentUS student = new StudentUS(111223333, 1970, 5, 3);
        BirthDate date = student.getBirthDate();
        date.setYear(2010); 
    }
    
}
