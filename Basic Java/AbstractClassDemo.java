/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package summer16;

abstract class GeoObj {
   protected  String color;
    GeoObj() {}
    GeoObj(String color) {
        this.color = color;
    }
    public String getColor() {
        return color;
    }
    public abstract double getArea();
}

class GeoCircle extends GeoObj  {
    double radius;
    GeoCircle (double radius, String color) {
        super(color);
        this.radius = radius;
    } 
    public double getArea() {
        return 3.14159*radius*radius;
    }    
}

class GeoRectangle extends GeoObj  {
    double width, height;
    GeoRectangle (double width, double height, String color) {
        super(color);
        this.width = width; this.height = height;
    } 
    public double getArea() {
        return width*height;
    }    
}

public class AbstractClassDemo {
    public static void main(String[] args) {
        //GeoObj g = new GeoObj();
        GeoObj g1 = new GeoCircle(5.0, "Red");
        GeoObj g2 = new GeoRectangle(2.0, 4.0, "Green");
        
        System.out.println(g1.getArea());
    }
   
}
