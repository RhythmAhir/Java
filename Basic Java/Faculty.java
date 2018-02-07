/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package summer16;

public class Faculty extends Employee {
                public Faculty() {
                    //super();
                    System.out.println("(4) Faculty's no-arg constructor is invoked");
                }
}

class Employee extends Person {
            public Employee() {              
                //super("Test");
                System.out.println("(3) Employee's no-arg constructor is invoked");                
            }
}
