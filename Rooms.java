import java.util.ArrayList;

public class Rooms
{
    public String roomName;
    public String roomDescription;
    //public String[] roomObjects;
    private ArrayList<Items> roomObjects;
    private int numberOfItems;

    public Rooms(String roomName, String roomDescription, String[] roomObjects)
    {
        this.roomName = roomName;
        this.roomDescription = roomDescription;
        //this.roomObjects = roomObjects;
        roomObjects = new ArrayList<>();
        

    }

    public String getName()
    {
        return this.roomName;
    }
    
    public String getDescription()
    {
        return this.roomDescription;
    }
    
    //public String getObject()
    //{
        //return this.roomObjects.toString();
    //}

    public ArrayList<Items>  getObjects() {
        return roomObjects;
           }
        
        public void addObject(Items item){
        roomObjects.add(item);
           }
        public void dropObject(Items item){
        roomObjects.remove(item);
           }
        
       
        public void setContents(ArrayList<Items> contents) {
        this.roomObjects = contents;
           }
       
        public int getNumberOfThings() {
        numberOfItems = roomObjects.size();
        return numberOfItems;
           }
}