import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner; 

public class Client {

	public static void main(String[] args) throws IOException {

		Scanner s = new Scanner(new File("InShuffle.txt"));
		ArrayList<String> str = new ArrayList<String>();
		
		while(s.hasNextLine())
			str.add(s.nextLine());
		
		System.out.println("Initial Deck.");
		System.out.println(str);
		
		ArrayList<String> a = new ArrayList<String>(); 
		ArrayList<String> b = new ArrayList<String>(); 
		  

		for (int i = 0; i < str.size(); i++)
		{
			if (i < (str.size()/2))
				a.add(str.get(i));
			else
				b.add(str.get(i));
		}
		

		System.out.println("1st Half.");
		System.out.println(a);

		System.out.println("2nd Half.");
		System.out.println(b);
		
		ArrayList<String> deck = new ArrayList<String>(); 
		
		for(int i = 0; i<(str.size()/2); i++) {
			
				deck.add(b.get(i));
				deck.add(a.get(i));
			
		}
		

		System.out.println("Final Deck.");
		System.out.println(deck);
		
		FileWriter writer = new FileWriter("InShuffle.txt"); 
		for(String str1: deck) {
		  writer.write(str1 + System.lineSeparator());
		}
		writer.close();
		
	}

}
