package main;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Checkout {
	public double calculatePrice(Basket b) {
		double cumDiscount = b.getBooksInBasket().size() / 3 * 0.01;
		double oneDiscount = b.getBooksInBasket().size() >= 10 ? 0.1 : 0.0;
		double uniqueDiscount = basketIsUnique(b) ? 0.05 : 0.0;
		return discountFirstDuplicatePair(b.getBooksInBasket())
			.stream()
			.mapToDouble(book -> book.getPrice())
			.sum() * (1 - cumDiscount - oneDiscount - uniqueDiscount);
	}
	public boolean basketIsUnique(Basket b) {
		List<Book> allBooks = new LinkedList<Book>(b.getBooksInBasket());
		Set<Book> uniqueBooksOnly = new HashSet<Book>(b.getBooksInBasket()); 
		return uniqueBooksOnly.size() == allBooks.size();
	}
	public LinkedList<Book> discountFirstDuplicatePair(LinkedList<Book> original) {
		LinkedList<Book> discounted = new LinkedList<>(original);
		LinkedList<Book> aux_acc = new LinkedList<>();
		for(int i = 0; i < discounted.size(); i++) {
			if(aux_acc.contains(discounted.get(i))) {
				discounted.get(i).setPrice(discounted.get(i).getPrice() * 0.5);
				Book previous = discounted.get(discounted.indexOf(discounted.get(i)));
				previous.setPrice(previous.getPrice() * 0.5);
				break;
			}
			else {
				aux_acc.add(discounted.get(i));
			}
		}
		return discounted;
	}
}
