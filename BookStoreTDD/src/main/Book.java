package main;

public class Book {
	private double price;
	private String isbn;
	private String name;
	private static final String DEFAULT_ISBN = "978-0-465-05065-9";
	public Book() {
		this.isbn = DEFAULT_ISBN;
	}
	public Book(double price) {
		this.price = price;
		this.isbn = DEFAULT_ISBN;
	}
	public Book(double price, String isbn) {
		this.isbn = isbn;
		this.price = price;
	}
	public double getPrice() {
		return price;
	}
	public String getISBN() {
		return isbn;
	}
	public void setPrice(double newPrice) {
		this.price = newPrice;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((isbn == null) ? 0 : isbn.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object o) {
		return this.isbn.equals(((Book) o).getISBN());
	}
}
