package summer16;

public class PolymorphismDemo {    
        public static void main(String[] args) {
            Object o;
            int n = (int) (Math.random()*10);            
            
            if (n<5)  o = new Student1();
            else o = new Person1();
            
            PolymorphismDemo p = new PolymorphismDemo();
            
            p.m(o);
        }

        public void m(Object x) {
            System.out.println(x.toString());
        }
}

class GraduateStudent1 extends Student1 {
    
}

class Student1 extends Person1 {
    public String toString() {
        return "Student";
    }
}

class Person1 extends Object {
    public String toString() {
          return "Person";
    }
}
