/*
 * Player class
 * Contains the attributes and constructor for the Player, includes a Hashtable that acts as memory/inventory for the objects the Player interacts with.
 * @param String name, Hashtable
 * @return Hashtable with the names and descriptions of Objects interacted with.
 */

import java.util.Hashtable; //to store memory of the objects that the player has interacted with throughout the game.

public class Player {
    public String name;
    public String description;
    public Hashtable<String, String> memory;

    /* Constructor */
    public Player(String name, String description) {
        this.name = name;
        this.description = description;
        this.memory = new Hashtable<String, String>();

    }

    public void addMemory(String object, String description) {// adds obejcts or evidence to player's inventory
        this.memory.put(object, description);
    }

    public void printMemory() {
        this.memory.toString();
    }

}
