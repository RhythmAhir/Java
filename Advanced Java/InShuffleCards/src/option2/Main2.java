package option2;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        System.out.println("Position of card: ");
        int position = sc.nextInt();
        System.out.println("No of shuffles: ");
        int timesShuffled = sc.nextInt();
        int finalPosition = position;

        for(int i=0; i < timesShuffled; i++){
            finalPosition = (finalPosition * 2)%53; // each card moves by (position*2)%53 in each shuffle
        }
        System.out.println("Position of card "+position+" after "+timesShuffled+" in shuffle(s) is "+finalPosition);


        position = 1;
        int shuffles = 0;
        finalPosition = position;
        while(finalPosition!=52){ //do shuffle until position is 52 for card is position 1
            finalPosition = (finalPosition * 2)%53;
            shuffles++;
        }
        System.out.println("First card takes "+shuffles+" shuffle(s) to become the bottom card.");


        int firstCardPosition = 1;
        int lastCardPosition = 52;
        shuffles = 0;

        for(int i=0; i < 52; i++){ // after 52 shuffles, all card go back to same position.
            firstCardPosition = (firstCardPosition * 2)%53;
            lastCardPosition = (lastCardPosition * 2)%53;
            shuffles++;
            if(firstCardPosition==lastCardPosition-1) //first card is above last card
            {
                System.out.println("First and last card touch after "+shuffles+" shuffle(s)");}
            if(firstCardPosition==lastCardPosition+1)//last card is above first card
            {
                System.out.println("First and last card touch after "+shuffles+" shuffle(s)");
        }
        }

    }
}
