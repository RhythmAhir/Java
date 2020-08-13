package option2;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	 public static void main(String[] args) throws IOException {

	        Scanner s = new Scanner(new File("InShuffle.txt"));
	        ArrayList<String> deckOfCards = new ArrayList<String>();

	        while(s.hasNextLine())
	            deckOfCards.add(s.nextLine());

	        System.out.println("Initial Deck.");
	        System.out.println(deckOfCards);

	        FileWriter writer = new FileWriter("InShuffle.txt");


	        ArrayList<String> firstHalf = new ArrayList<>();
	        ArrayList<String> secondHalf = new ArrayList<>();
	        ArrayList<String> finalDeck = new ArrayList<>();
	        
	        for(int i=0; i < deckOfCards.size()/2; i++){
	        	
	            String topCard = deckOfCards.get(i+deckOfCards.size()/2);
	            finalDeck.add(topCard);
	            writer.write(topCard + System.lineSeparator());
	            secondHalf.add(topCard);
	            
	            String bottomCard = deckOfCards.get(i);
	            finalDeck.add(bottomCard);
	            writer.write(bottomCard + System.lineSeparator());
	            firstHalf.add(bottomCard);

	        }
	        writer.close();


	        System.out.println("1st Half.");
	        System.out.println(firstHalf);

	        System.out.println("2nd Half.");
	        System.out.println(secondHalf);

	        System.out.println("Final Deck.");
	        System.out.println(finalDeck);

	    }
}
