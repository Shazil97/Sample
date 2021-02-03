package W21COMP1008;

import W21COMP1008.Card;

import java.util.ArrayList;
import java.util.Arrays;

public class TestingCards {
    public static void main(String[] args) {
        Card card1 = new Card("ace","spades");
        Card card2 = new Card("four","hearts");
        Card card3 = new Card("five","diamonds");
        Card card4 = new Card("queen", "hearts");
        Card card5 = new Card("king", "hearts");

        //ArrayList can be used to hold multiple objects
        //adding individual Card objects to the arraylist
        ArrayList<Card> myHand = new ArrayList<>();
        myHand.add(card1);
        myHand.add(card2);
        System.out.println(myHand);

        myHand.addAll(Arrays.asList(card3, card4, card5));
        System.out.println(myHand);
        //if you want to remove any card (object) from the Array list you can use
        // myHand is a variable stored in an Array .remove the action command and index is the position basically
        // this command will remove the card from the list but the object(card) will stay in the memory
        myHand.remove(0); //Card1 will get remove
        System.out.println(myHand);
        System.out.println(card1);
    }
}


// Nouns are the objects in Array list (Naming words) and verbs are the methods (actions)

