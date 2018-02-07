/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package summer16;

public class Student {
    private String name;
    private String id;
    private double cgpa;
    public String ins_name;
    
    public Student() {
        this("No Name", "XXXXXX");
    }
    
    public Student(String name, String id) {
        this.name = name;
        this.id = id;
    }
    
    public Student(String name, String id, String ins_name) {
        this.name = name;
        this.id = id;
        this.ins_name = ins_name;
    }
    
    public void setName(String name) {
        this.name = name; 
    }
    
    public String getName() {
        return this.name; // or name
    }
    
    private String test1() {
        return "abc";
    }
    public String test2() {
        return "xyz" + test1();
    }
    
    public String toString() {
        if (ins_name == null) 
            return "Name: " + name + " ID: " + id;
        else return "Name: " + name + " ID: " + id + " Institution Name: " + ins_name;
    }
}
