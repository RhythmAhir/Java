/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package summer16;

public class StackOfInt {
    private int[] elements;
    private int size;
    
    public StackOfInt() {
        this(16);
    }
    
    public StackOfInt(int capacity) {
        elements = new int[capacity];
        size  = 0;        
    }
    
    public boolean empty() {
        if (size==0) return true;
        else return false;
    }
    
    public int peek() {
        return elements[size-1];
    }
    
    public int push(int value) {
        if (size==elements.length) return 0;
        else {
            elements[size] = value;
            size = size + 1;
            return 1;
        }
    }

    public int pop() {
        size = size - 1;
        return elements[size];
    }
    
    public int getSize() {
      return size;  
    }
}
