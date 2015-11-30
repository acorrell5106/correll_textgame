
package correll_textgame;
import java.util.Scanner;

public class Correll_textgame {
static String username;
static String usergender;
static String position;
static boolean acceptable = false;
static boolean male = false;
static boolean female = false;
static boolean scientist = false;
static boolean militia = false;


    public static void main(String[] args) {
        name();
        gender();
        position();
        intro();
    }
    
    static void name() {
        Scanner Name = new Scanner(System.in);
        System.out.println("User's Name Is:");
        username = Name.nextLine();
    }
    
    static void gender() {
        Scanner Gender = new Scanner(System.in);
        System.out.println("User's Gender Is:");
        usergender = Gender.nextLine();
        if (usergender.contains("M") || usergender.contains("m")) {
            male = true;
            acceptable = true;
        } else if (usergender.contains("F") || usergender.contains("f")) {
            female = true;
            acceptable = true;
        } else {
            System.out.println("Error: Acceptable Answer Not Detected");
        }
    }
    
    static void position() {
        Scanner Position = new Scanner(System.in);
        System.out.println("Choose Your Position:\nScientist | Militia\n");
        position = Position.nextLine();
        if (position.contains("S") || position.contains("s")) {
            scientist = true;
            acceptable = true;
        } else if (position.contains("M") || position.contains("m")) {
            militia = true;
            acceptable = true;
        } else {
            System.out.println("Error: Acceptable Answer Not Detected");
        }
    }
        
    static void intro() {
        if (scientist) { 
            System.out.println("\nWelcome, " + username + ", to X04274. "
                + "This planet is one of the last to support alien life, "
                + "all others being occupied by the human race. "
                + "\nYour population of over ___ beings required many more planets to support them, "
                + "leaving X04274 unoccupied and untainted. \nAs instructed by your official, "
                + "it is your duty to document the beings of this planet, "
                + "noting their habits and behavior.");
        } else if (militia) {
            System.out.println("\nWelcome, " + username + ", to X04274. "
                + "This planet is one of the last to support alien life, "
                + "all others being occupied by the human race. "
                + "\nYour population of over ___ beings required many more planets to support them, "
                + "leaving X04274 unoccupied and untainted. \nAs instructed by your official, ");
        }    
    }
}  
  
