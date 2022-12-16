/*
 * Player class
 * Contains the attributes and constructor for the Player, includes a Hashtable that acts as memory/inventory for the objects the Player interacts with.
 * @param String name, Hashtable
 * @return Hashtable with the names and descriptions of Objects interacted with.
 */
 
import java.util.Hashtable; //to store memory of the objects that the player has interacted with throughout the game.

public class Player {
    public String name;
    public boolean belief;
    public int health;
    public String description;
    public Hashtable<String, Boolean> inventory;

    /*Constructor */
    public Player(String name, boolean belief, String description) {
        this.name = name;
        this.belief = belief;
        this.description = description;
        this.health = 5;
        this.inventory = new Hashtable<String, Boolean>();

    }

    public int healthDecrease() {// changes the hauntChance
        this.health -= 1;
        return this.health;
    }

    public void addInventory(Boolean evidence, String object) {// adds obejcts or evidence to player's inventory
        this.inventory.put(object, evidence);
    }

    public String checkActions(String roomName) {
        if (this.belief = true) {
            if (roomName.equals("The Attic")) {
                return "actions1";
            }
            if (roomName.equals("Sally's Room")) {
                return "actions2";
            }
            if (roomName.equals("The Kitchen")) {
                return "actions3";
            }
            if (roomName.equals("The Basement")) {
                return "actions4";
            }
        }
        if (this.belief = false) {
            if (roomName.equals("The Attic")) {
                return "actions1";
            }
            if (roomName.equals("Sally's Room")) {
                return "actions2";
            }
            if (roomName.equals("The Kitchen")) {
                return "actions3";
            }
            if (roomName.equals("The Basement")) {
                return "actions4";
            }
        }
        return "Room not found";
    }

           
        
}



