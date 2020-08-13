import java .util.Observer;
import java .util.Observable;

public class ConcreteObserver implements Observer {
	
private float price;

public void update(Observable obj, Object a) {
	
price = ((Float)a).floatValue();

System.out.println("PriceObserver: Price changed to " + price);
}
}