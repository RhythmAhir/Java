package com.fdmgroup.pensions.task3;
import java.util.Date;
public class Person{  
    private String fname;   
    private String lname;  
    private Date dob;  


    public Person( ){
        fname = null;
        lname = null;  
        dob = null;
    }

    public Person(String nameValue, String newAddress, Date newDob){  
        fname = nameValue;
        lname = newAddress;
        dob = newDob;  
    }


    public String getfName(){
        return fname;
    }

    public void setfName(String fnameValue){
        fname = fnameValue;
    }

    public String getlName(){
        return lname;
    }

    public void setlname(String lnameValue){
        lname = lnameValue;
    }

    public Date getDateOfBirth(){
        return dob;
    }

    public void setDateOfBirth(Date newDob){
        dob = newDob;
    }

    public void print(){
        System.out.println("First Name: " + fname); 
        System.out.println("Last Name: " + lname); 
        System.out.println ("Date Of Birth: " + dob); 
    }

}   