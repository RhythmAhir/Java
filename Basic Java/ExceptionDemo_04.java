/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package summer16;

class NegativeRadiusExp extends Exception {
    String s;
    NegativeRadiusExp() {
        s = "Default Text for Negative Radius Exception";
    }
    
    NegativeRadiusExp(String x) {
        s = x;
    }
    public String toString() {
        return s;
    }    
}

public class ExceptionDemo_04 {
    public static void setRadius(double r) throws NegativeRadiusExp {
        //NegativeRadiusExp z = new NegativeRadiusExp("Radius Can't be negative");
        if (r<0) throw new NegativeRadiusExp("Radius can't be negative");
    }
    public static void main(String[] args) {
        try {
            setRadius(-10);
        } catch (ArithmeticException x) {            
        } catch (NegativeRadiusExp x) {
            System.out.println(x.toString());
        }
    }
}
