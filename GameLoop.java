import java.util.Scanner;

public class GameLoop {

    public static void main(String[] args) {
        HauntedHouse hollowsHouse = new HauntedHouse("Hollow's House", "1234 Somewhere Ave", 4, "Hollow's House is.....");



        // This is a "flag" to let us know when the loop should end
        boolean stillPlaying = true;

        // We'll use this to get input from the user.
        Scanner userInput = new Scanner(System.in);

        // Storage for user's responses
        String userResponse = "";

        // This could be replaced with a more interesting opening
        System.out.println("******************");
        System.out.println("WELCOME TO THE HAUNTING OF HOLLOW'S HOUSE");
        System.out.println("*****************\n");

        System.out.println(hollowsHouse);

        // Instructions are sometimes helpful
        System.out.println("The purpose of this game is to xyz \n");
        System.out.println("Type ENTER HOUSE to continue playing: \n");
            userInput.nextLine();
        

        do {// The do...while structure means we execute the body of the loop once before
        // checking the stopping condition
     
            // ************************************************
            // The stuff that happens in your game will go here
            // ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓
            if(userResponse == "ENTER HOUSE"){
                System.out.println(hollowsHouse.enter());  
                System.out.println("You are still playing. Follow the instructions if you want to win/lose..."); 
                
            }
            else {
                System.out.println("Come back if you want to test your courage.");
            }
            userResponse = userInput.nextLine().toUpperCase();

            // ***********************************************************************
            // And as the player interacts, you'll check to see if the game should end
            // ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓
            if (userResponse.equals("LEAVE") || userResponse.equals("LOSE")) {
                stillPlaying = false;
            }
        } while (stillPlaying);

        // Tidy up
        userInput.close();

        // Once you exit the loop, you may need to deal with various possible stopping
        // conditions
        if (userResponse.equals("WIN")) {
            System.out.println("Yay, you won!");
        } else { // userResponse.equals("LOSE")
            System.out.println("Better luck next time.");
        }

    }

}
