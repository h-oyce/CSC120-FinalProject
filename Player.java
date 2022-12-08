import java.util.Hashtable;

public class Player {
    public String name;
    public boolean belief;
    public double hauntChance;
    public String description;
    public Hashtable<String, Boolean> inventory;

    public Player(String name, boolean belief, String description) {
        this.name = name;
        this.belief = belief;
        this.description = description;
        this.hauntChance = 1000.00;
        this.inventory = new Hashtable<String, Boolean>();

    }

    public double changeChance(double newChance) {// changes the hauntChance
        this.hauntChance = newChance;
        return this.hauntChance;
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
