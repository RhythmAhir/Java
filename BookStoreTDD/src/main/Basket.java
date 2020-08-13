package main;

import java.util.LinkedList;

public class Basket {
	private LinkedList<Book> booksInBasket;
	public Basket() {
		booksInBasket = new LinkedList<Book>();
	}
	public LinkedList<Book> getBooksInBasket() {
		return new LinkedList<Book>(booksInBasket);
	}
	public void setBooksInBasket(LinkedList<Book> initialBookList) {
		this.booksInBasket = initialBookList;
	}
	public void addBook(Book bk) {
		this.booksInBasket.add(bk);		
	}
}
