import java.io.IOException;
import java.util.Scanner;

public class GameLoop {

    public static void main(String[] args) throws IOException {
        HauntedHouse hollowsHouse = new HauntedHouse("Hollow's House", "1234 Somewhere Ave", 4,
                " Hollow's House is [supposedly] a haunted house, haunted by the late resident's daughter, Sally. Ever since the family passed away, nobody has been able to move in. Eerie incidents, screams heard at night, and strange shadows lurking around the corners of each room have left the house deserted. \n ");

        Player Investigator = new Player("Paranormal Investigator", true,
                "After several incidents and paranormal activity sightings surrounding Hollow's House, you, a PARANORMAL INVESTIGATOR, have been called by the neighborhood to explore Hollow's House.");

        Rooms one = new Rooms("THE ATTIC ", " - It's too quiet in here, you can hear every creak and shuffle...\n"
                + "All you see are SPIDER WEBS, PACKED BOXES -- what's inside them ? -- and a ROCKING CHAIR.\n");
        Rooms two = new Rooms("SALLY'S ROOM ",
                " - According to legends, you can hear the giggles of a little ghost girl in here... \n"
                        + "The room doesn't look suspicious, just old. You see a BABY DOLL on the bed, a HAND MIRROR on the vanity, and a TOY BALL on the floor.\n");
        Rooms three = new Rooms("THE KITCHEN", " - Home cooked meals and flying plates...\n"
                + "You see the typical dining utensils -- except they're floating in the air. A KNIFE and a PLATE particularly stand out to you for some reason. On the wall is an EERIE FAMILY PORTRAIT.\n");
        Rooms four = new Rooms("THE BASEMENT",
                " - Separated from the rest of the other rooms, the atmosphere feels completely different. This room reportedly has the most paranormal activity...\n"
                        + "Seemingly random objects are strewn across the floor. This room could just be another storage space. You see an OLD ROCKING HORSE, a BROKEN GRANDFATHER CLOCK, a DUFFLE BAG, and a PROSTHETIC LEG.\n");
        Rooms foyer = new Rooms("FOYER", " - You've returned back to the foyer. \n");

        Images hhImage = new Images("Images/HauntedHouse.jpg");

        // This is a "flag" to let us know when the loop should end
        boolean stillPlaying = true;

        // We'll use this to get input from the user.
        Scanner userInput = new Scanner(System.in);

        // Storage for user's responses
        String userResponse = "";

        // This could be replaced with a more interesting opening
        System.out.println("******************************************");
        System.out.println("WELCOME TO THE HAUNTING OF HOLLOW'S HOUSE");
        System.out.println("******************************************\n");

        System.out.println(hollowsHouse);
        hhImage.make();

        // Instructions are sometimes helpful
        System.out.println(
                "The purpose of this game is to explore Hollow's House. As you explore, you can interact and collect objects as evidence to prove (or disprove) the existence of a ghost. By obtaining enough evidence, you will come out of Hollow's House safe and sound. But if you collect too many objects that are haunted, you will become possessed! Right now you're standing outside of Hollow's House. It appears to be haunted by a ghost. \n");

        /*
         * if yes then use P1 if no then use P2 <==================================
         * choosing character before starting game
         */
        // Player believer = new Player(userResponse, stillPlaying)
        // Player denier = new Player(userResponse, stillPlaying)

        System.out.println("Type ENTER HOUSE to continue playing: \n");
        userResponse = userInput.nextLine().toUpperCase();

        do {// The do...while structure means we execute the body of the loop once before
            // checking the stopping condition

            // ************************************************
            // The stuff that happens in your game will go here
            // ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓

            if (userResponse.equals("ENTER HOUSE")) {
                hollowsHouse.enter();
                // System.out.println("You are still playing. Follow the instructions if you
                // want to win/lose...\n");

                /* Description for when Player enters */
                System.out.println(
                        "You've entered THE FOYER of the house. After looking around for little, you find that almost all of the doors are locked. However, there appear to be four rooms that can be entered:\n");
                // Lists out room options for player. Does not mprovide roomDescription unless
                // the Player enters the house.

                String continueExploring = "";

                Boolean stillExploring = true;
                if (continueExploring.equals("NO")) {
                    stillExploring = false;
                }

                System.out.println("Which room would you like to explore?"); // asks Player to select a room to explore
                while (stillExploring) {

                    System.out.println("\n" + one.roomName + "\n" + two.roomName + "\n" + three.roomName + "\n"
                            + four.roomName + "\n" + foyer.roomName + "\n");
                    userResponse = userInput.nextLine().toUpperCase(); // scans and stores the user response

                    if (userResponse.equals("THE ATTIC")) {
                        System.out.println("\n" + one);
                        Investigator.checkActions("THE ATTIC");
                    }

                    else if (userResponse.equals("SALLY'S ROOM")) {
                        System.out.println("\n" + two);
                    }

                    else if (userResponse.equals("THE KITCHEN")) {
                        System.out.println("\n" + three);
                    }

                    else if (userResponse.equals("THE BASEMENT")) {
                        System.out.println("\n" + four);
                    }

                    else if (userResponse.equals("FOYER")) {
                        System.out.println("\n" + foyer);
                    }

                    else {
                        System.out.println("This room can't be accessed.");
                    }

                    System.out.println("Would you like to keep exploring?");
                    continueExploring = userInput.nextLine().toUpperCase();
                    if (continueExploring.equals("NO")) {
                        stillExploring = false;
                    }

                }
                System.out.println("Do you believe in ghosts?\n");
                String ghostResponse = userInput.nextLine().toUpperCase();

                if (ghostResponse.equals("YES")) {
                    System.out.println("Ghosts are...");
                } else if (ghostResponse.equals("NO")) {
                    System.out.println("Ghosts aren't");
                } else {
                    System.out.println("Sorry, I didn't understand that. Do you think ghosts exist?");
                }

            }

            else {
                System.out.println(
                        "Sorry, I didn't understand that. If you would like to start playing, please type ENTER HOUSE.");

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
             * // Potential messages that will print out based on the players win status
             * //↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓
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
