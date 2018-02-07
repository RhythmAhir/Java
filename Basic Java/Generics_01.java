/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package summer16;

import java.util.ArrayList;
import java.util.Date;

public class Generics_01 {
    
    public static void test1() {
        ArrayList list = new ArrayList();
        
        list.add(123);
        list.add(12.34);
        list.add("abc");
       
        int n = (int) list.get(0);
        String s = (String) list.get(0);
        
        System.out.println(s);       
    }
    
    public static void test2() {
        Comparable d = new Date();
        System.out.println(d.compareTo("NSU"));
    }
    
    public static void test3() {
        ArrayList<String> list = new ArrayList<String>();
        ArrayList<Integer> list2 = new ArrayList<Integer>();
        
        list2.add(123);
       // list.add(12.34);
        list.add("abc");
       
        String s =  list.get(0);
        
        System.out.println(s);       
    }
    
    public static void main(String[] args) {
        GenericStack<Integer> s1 = new GenericStack<Integer>();
        GenericStack<String> s2 = new GenericStack<String>();
        
        s1.push(12);
        s2.push("abc");
        
        System.out.println(s1.pop());
    }
}
