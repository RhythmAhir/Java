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
public class Person {
        String name;
                public Person() {
                    System.out.println("(1) Person's no-arg constructor is invoked");
                }
                public Person(String name) {
                    this.name = name;
                    System.out.println("(2) Person's 1-arg constructor is invoked");
                }
}