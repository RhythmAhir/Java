package test;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import main.Basket;
import main.Book;
import main.Checkout;

public class CheckoutTest {
	Basket b;
	Checkout c;
	
	@Before
	public void setUp() {
		b = new Basket();
		c = new Checkout();
	}
	@Test
	public void test_CalculatePrice_ReturnsDoubleZeroPointZeroWhenPassedAnEmptyBasket() {
		double totalPrice = c.calculatePrice(b);
		assertEquals(0.0, totalPrice, 0.001);
	}
	
	@Test
	public void test_CalculatePrice_ReturnsPriceOfBookInBasket_WhenPassedBasketWithOneBook(){
		b = new Basket();
		b.addBook(new Book());
		double totalPrice = c.calculatePrice(b);
		assertEquals(0.0, totalPrice, 0.001);
		b = new Basket();
		b.addBook(new Book(23.52));
		totalPrice = c.calculatePrice(b);
		assertEquals(23.52 * 0.95, totalPrice, 0.001);
	}
	
	@Test
	public void test_CalculatePrice_ReturnsPriceOfBookInBasket_WhenPassedBasketWithTwoBooks(){
		b = new Basket();
		b.addBook(new Book(12.52));
		b.addBook(new Book(25.12));
		double totalPrice = c.calculatePrice(b);
		assertEquals(37.64 * 0.5, totalPrice, 0.001);
	}

	@Test
	public void test_CalculatePrice_ReturnsPriceOfBookInBasket_WhenPassedBasketWithThreeBooks() {
		b = new Basket();
		b.addBook(new Book(12.52));
		b.addBook(new Book(25.12));
		b.addBook(new Book(25.12));
		double totalPrice = c.calculatePrice(b);
		assertEquals((12.52 * 0.5 + 25.12 * 0.5 + 25.12) * 0.99, totalPrice, 0.001);
	}
	
	@Test
	public void test_CalculatePrice_ReturnsPriceOfBookInBasket_WhenPassedBasketWithSevenBooks() {
		b = new Basket();
		b.addBook(new Book(12.52));
		b.addBook(new Book(25.12));
		b.addBook(new Book(12.52));
		b.addBook(new Book(25.12));
		b.addBook(new Book(12.52));
		b.addBook(new Book(25.12));
		b.addBook(new Book(235));
		double totalPrice = c.calculatePrice(b);
		assertEquals((12.52 * 0.5 + 25.12 * 0.5 + 12.52 + 25.12 + 12.52 + 25.12 + 235) * 0.98, 
				totalPrice, 0.001);
	}
	
	@Test
	public void test_CalculatePrice_ReturnsPriceOfBookInBasket_WhenPassedBasketWithTenBooks() {
		b = new Basket();
		b.addBook(new Book(1.5));
		b.addBook(new Book(2.5));
		b.addBook(new Book(5));
		b.addBook(new Book(100));
		b.addBook(new Book(50));
		b.addBook(new Book(1.5));
		b.addBook(new Book(2.5));
		b.addBook(new Book(5));
		b.addBook(new Book(100));
		b.addBook(new Book(50));
		double totalPrice = c.calculatePrice(b);
		assertEquals((1.5 + 0.75 + 1.25 + 2.5 + 5 + 5 + 50 + 50 + 100 + 100) * 0.87, 
				totalPrice, 0.001);
	}
	
	@Test
	public void test_CalculatePrice_ReturnsPriceOfBookInBasket_WhenPassedBasketWithUniqueBooks() {
		b = new Basket();
		b.addBook(new Book(100.5, "12124125"));
		b.addBook(new Book(100, "12124126"));
		b.addBook(new Book(100, "12124127"));
		double totalPrice = c.calculatePrice(b);
		assertEquals((100 + 100 + 100.5) * 0.94, totalPrice, 0.001);
	}
	
	@Test
	public void test_CalculatePrice_ReturnsPriceOfBookInBasket_WhenPassedBasketWithDuplicateBooks() {
		b = new Basket();
		b.addBook(new Book(100.5, "12124125"));
		b.addBook(new Book(100, "12124126"));
		b.addBook(new Book(100, "12124126"));
		double totalPrice = c.calculatePrice(b);
		assertEquals((100 * 0.5 + 100 * 0.5 + 100.5) * 0.99, totalPrice, 0.001);
	}
	
	@Test
	public void test_CalculatePrice_ReturnsPriceOfBookInBasket_WhenOnePairOfSameBook() {
		b = new Basket();
		b.addBook(new Book(100.5, "12124125"));
		b.addBook(new Book(100, "12124126"));
		b.addBook(new Book(100, "12124126"));
		double totalPrice = c.calculatePrice(b);
		assertEquals((100.5 + 50 + 50) * 0.99, totalPrice, 0.001);
	}
	
	@Test
	public void test_CalculatePrice_ReturnsPriceOfBookInBasket_WhenTwoPairsOfSameBook() {
		b = new Basket();
		b.addBook(new Book(100.5, "12124125"));
		b.addBook(new Book(100.5, "12124125"));
		b.addBook(new Book(100, "12124126"));
		b.addBook(new Book(100, "12124126"));
		double totalPrice = c.calculatePrice(b);
		assertEquals((50.25 + 50.25 + 100 + 100) * 0.99, totalPrice, 0.001);
	}
	
	@Test
	public void test_CalculatorPrice_ReturnsPriceOfBookInBasket_WhenOneTripletOfSameBook() {
		b = new Basket();
		b.addBook(new Book(100.5, "12124125"));
		b.addBook(new Book(100, "12124126"));
		b.addBook(new Book(100, "12124126"));
		b.addBook(new Book(100, "12124126"));
		double totalPrice = c.calculatePrice(b);
		assertEquals((100.5 + 50 + 50 + 100) * 0.99, totalPrice, 0.001);
	}
	
	@Test
	public void test_CalculatorPrice_ReturnsPriceOfBookInBasket_WhenNoPairsOfSameBook() {
		b = new Basket();
		b.addBook(new Book(100.5, "12124125"));
		b.addBook(new Book(100, "12124126"));
		double totalPrice = c.calculatePrice(b);
		assertEquals((100.5 + 100) * 0.95, totalPrice, 0.001);
	}
}
