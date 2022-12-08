import java.util.Scanner;

public class GameLoop {

    public static void main(String[] args) {
        HauntedHouse hollowsHouse = new HauntedHouse("Hollow's House", "1234 Somewhere Ave", 4, " Hollow's House is.....");

        Player ryan = new Player("Ryan", true, "");
        Player shane = new Player("Shane", false, "");

        Rooms one = new Rooms("The Attic", "Upper level");
        Rooms two = new Rooms("Sally's Room", "bedroom");
        Rooms three = new Rooms("The Kitchen", "kitchen");
        Rooms four = new Rooms("The Basement", "basement");

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
        System.out.println(
                "The purpose of this game is to xyz. Right now you're standing outside of Hollow's House. It appears to be haunted by ghosts. \n");

        System.out.println("Do you believe in ghosts?\n");
        userInput.nextLine();

        /*
         * if yes then use P1 if no then use P2 <==================================
         * choosing character before starting game
         */
        // Player believer = new Player(userResponse, stillPlaying)
        // Player denier = new Player(userResponse, stillPlaying)

        System.out.println("Type ENTER HOUSE to continue playing: \n");
        userInput.nextLine();

        do {// The do...while structure means we execute the body of the loop once before
            // checking the stopping condition

            // ************************************************
            // The stuff that happens in your game will go here
            // ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓         
           
            if(userResponse.equals("ENTER HOUSE")){
                hollowsHouse.enter();  
                System.out.println("You are still playing. Follow the instructions if you want to win/lose..."); 
         
            }
            else{
                System.out.println("Sorry, I didn't understand that. If you would like to start playing, please type ENTER HOUSE.");

            }
            userResponse = userInput.nextLine().toUpperCase();

            // ***********************************************************************
            // And as the player interacts, you'll check to see if the game should end
            // ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓
            if (userResponse.equals("LEAVE") || userResponse.equals("LOSE")) {
                stillPlaying = false;
                System.out.println("Come back if you want to test your courage.");
            }


            /************************************************************************
            // Potential messages that will print out based on the players win status
            //↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ */
            
            /*when stillPlaying ==false;
            if player Won:
            System.out.println("Congratulations. You made it out of Hollow's House. You've also helped Hollow's spirit lay to rest. etcetcetc");

            else if player Neutral:
            if player believes in ghosts
                System.out.println("You've made it out of the house! It was pretty scary, but a lot of things just seemed to be a coincidence... Was there really a ghost here?");

            else if player doesn't believe in ghosts
                System.out.println("You've made it out of the house! It felt like a waste of your time, nothing seemed out of the ordinary -- just an old house. Ghosts aren't real.");
            
            else //player Lost:
                System.out.println("!!!");
                
                if player believes in ghosts:
                System.out.println("Look on the bright side, you've proven that ghosts are real. Unfortunately you became possessed in the process.");

                if player doesn't believe in ghosts:
                System.out.println("Ghosts are real after all. Unfortunately you had to find out the hard way.");
                */

            

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
