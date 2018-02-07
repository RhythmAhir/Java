package summer16;

public class Circle {
    private double radius;
    
    Circle() {
        radius = 1.0;
    }
    
    Circle(double r) {
        radius = r;
    }
    
    public void setRadius(double r) {
        radius = r;
    }
    
    public double getRadius() {
        return radius;
    }
    
    public double getArea() {
        return 3.14159 * radius * radius;
    }    
    
    public static void main(String[] args) {
      Circle c1 = new Circle();  
      Circle c2 = new Circle(2.5);
      
      System.out.println(c2.getArea());      
    }   
}
