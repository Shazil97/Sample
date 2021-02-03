package W21COMP1008;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class VideoGame {

    private String gameName;

    public VideoGame(Character ageRating) {

    }

    private Character ageRating;
    private double price;
    private String console;
    ArrayList<String> genre;



    //Set of Constructors
    public VideoGame(String gameName, Character ageRating, double price, String console) {
        this.gameName = gameName;
        this.price = price;
        this.console = console;
        this.ageRating = ageRating;
    }



     //Set of Setters & Getters
    public String getGameName() {
        return gameName;
    }

    public void setGameName(String gameName) {
        gameName = gameName.toLowerCase();
        if(getgameName().contains(gameName))
            this.gameName = gameName;
        else {
            throw new IllegalArgumentException(gameName + "Please enter valid game name, use one of" + getGameName());
        }

    }

    public Character getAgeRating() {
        return ageRating;
    }

    /**
     * This method will return the valid names of game
     * @return  List holding String objects with the valid game names
     */
    public static List<String> getgameName()
    {
        return Arrays.asList("Call of Duty","Assissin's Creed","Need for Speed","Super-Mario","Pubg");
    }

    public void setAgeRating(Character ageRating) {
        if (ageRating >= 4 && ageRating <= 17) ;
              this.ageRating = ageRating;
        else{
            throw new IllegalArgumentException(ageRating + "Please enter valid description" + getAgeRating());
        }
    }



    public double getPrice() {
        return price;
    }

    public void setList(ArrayList<Double> list) {
        this.list = list;
    }
    /**
     * This method will return an ArrayList of price
     * @return a list of prices that has double data type
     * @param price
     */

    public ArrayList<Double> list = new ArrayList<>(5);




    public void setPrice(double price) {
        this.price = price;
    }

    public String getConsole() {
        return console;
    }

    public void setConsole(String console) {
        this.console = console;
    }
    public ArrayList<String> getGenre() {
        return genre;
    }

    public void setGenre(ArrayList<String> genre) {
        this.genre = genre;
    }

}
