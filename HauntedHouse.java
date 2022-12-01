public class HauntedHouse{
    private String address;
    private String name;
    private int numRooms;
    public String description;
    private boolean playerPresent;


    public HauntedHouse(String name, String address, int numRooms, String description){
        this.name = name;
        this.address= address;
        this.numRooms = numRooms;
        this.description = description;
        this.playerPresent = false;
    }

    public String getName(){
        return this.name;
    }

    public String getAddress(){
        return this.address;
    }

    public int numRooms(){
        return this.numRooms;
    }

    public String description(){
        return this.description;
    }

    /*Navigation Methods? */

    public HauntedHouse enter(){
        playerPresent = true;
        System.out.println("You've entered " + this.name + " located at " + this.address);

        return this;
    }


    public boolean inHouse(){
        if (playerPresent == true){

            return true;
        }
        else{
            return false;
        }

    }
    
    public void showOptions(){
        System.out.println("");
    }

    public String toString(){
        return (this.name + "is a haunted house located at " + this.address + ".");
    }
    public static void main(String args[]){


    }
}
