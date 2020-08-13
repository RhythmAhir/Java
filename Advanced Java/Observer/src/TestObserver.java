public class TestObserver {
/**
* @param args
*/
public static void main(String[] args) {
	
ConcreteSubject s = new ConcreteSubject("Rhythm",1.29f);

ConcreteObserver o = new ConcreteObserver();

s.addObserver(o);
s.setPrice(4.56f);
s.setPrice(2.3f);
}
}