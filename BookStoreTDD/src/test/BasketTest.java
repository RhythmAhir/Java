package test;

import static org.junit.Assert.assertEquals;

import java.util.LinkedList;

import org.junit.Before;
import org.junit.Test;

import main.Basket;
import main.Book;

public class BasketTest {
	Basket b;
	Book bk;
	@Before
	public void setUp() {
		b = new Basket();
		bk = new Book();
	}

	@Test
	public void test_GetBooksInBasket_ReturnsEmptyBookList_IfNoBooksHaveBeenAdded() {
		LinkedList<Book> booklist = b.getBooksInBasket();
		assertEquals(0, booklist.size());
	}
	
	@Test
	public void test_GetBooksInBasket_ReturnsArrayOfLengthOne_AfterAddBookMethodIsCalledWithOneBook(){
		b.addBook(bk);
		LinkedList<Book> booklist = b.getBooksInBasket();
		assertEquals(1, booklist.size());
	}
	
	@Test
	public void test_GetBooksInBasket_ReturnsArrayOfNthLength_AfterAddNthBook() {
		b.addBook(bk);
		b.addBook(bk);
		LinkedList<Book> booklist = b.getBooksInBasket();
		assertEquals(2, booklist.size());
	}
}
