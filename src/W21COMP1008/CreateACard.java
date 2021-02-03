package W21COMP1008;

import java.util.List;
import java.util.Scanner;

public class CreateACard {
   public static void main(String[] args){
       //Create a Scanner
       // datatype object name :
       Scanner    scanner     = new Scanner(System.in);
       Card       aceOfSpades    = new Card("Ace", "Spades", 14);
       Card       twoOfHearts = new Card("two","Hearts", 13);
       Card       aceofHearts = new Card ("ace","Hearts");


       //on lines 9 and 10 we instantiated 2 Card objects

       System.out.println(aceOfSpades);
       System.out.println(twoOfHearts);


       // experiment to see how the index method works ?
       /* This method is used to return the occourences of letters or digit of a specified character */
       /*
       List<String> faceNames = card.getValidfaceNames(); //This will give valid face names by making the method static
       int positionTwo= faceNames.indexOf("two");
       int positionThree= faceNames.indexOf("three");
       int positionKing= faceNames.indexOf("King");
       */
   }
}
/*
Array is the way of storing multiple object

 */