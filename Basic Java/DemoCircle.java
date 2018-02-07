/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package summer16;

public class DemoCircle {
    public static int add(int a, int b) {
        int z = a + b;
        a = 10; b = 20;
        return z;
    }
    
    public static int max(int[] a) {
        int m=0;
        for (int i=0; i<a.length; i++) {
            if (a[i]>a[m]) m = i;
        }
        a[1] = 25;
        return a[m];
    }
    
    public static int compare(Circle a, Circle b) {
        int z=0;
        if (a.getRadius()>b.getRadius()) z = 1;
        else if (a.getRadius()<b.getRadius()) z = -1;
        else  z=0;        
        a.setRadius(25);
        return z;
        
    }
    public static void main(String[] args) {
      Circle c1 = new Circle();  
      Circle c2 = new Circle(2.5);    
      System.out.println(c1.getRadius());      
      
      int a = 5, b = 7;
      int c = add(a,b);
      System.out.println(a);
      
      int[] list = {4,5,6};
      int d = max(list);
      System.out.println(list[1]);
      
      int test = compare(c1, c2);
      System.out.println(c1.getRadius());
      
    }   
}
