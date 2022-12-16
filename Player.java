import java.util.Hashtable;

public class Player {
    public String name;
    public int health;
    public String description;
    public Hashtable<String, String> memory;

    public Player(String name, String description) {
        this.name = name;
        this.description = description;
        this.health = 5;
        this.memory = new Hashtable<String, String>();

    }

    public int healthDecrease() {// changes the hauntChance
        this.health -= 1;
        return this.health;
    }

    public void addMemory(String object, String description) {// adds obejcts or evidence to player's inventory
        this.memory.put(object, description);
    }

    public void printMemory() {
        this.memory.toString();
    }

}
