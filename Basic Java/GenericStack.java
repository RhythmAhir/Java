/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package summer16;

import java.util.ArrayList;

/**
 *
 * @author Rajesh
 */
public class GenericStack <E> {
    ArrayList<E> list = new ArrayList<E>();
    
    void push(E x) {
        list.add(x);        
    }
    
    E pop() {
        return list.remove(list.size()-1);
    }    
}
