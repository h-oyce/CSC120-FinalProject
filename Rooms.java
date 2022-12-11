import java.util.ArrayList;

public class Rooms
{
    public String roomName;
    public String roomDescription;
    private ArrayList<String> roomObjects;
    private int numberOfItems;

    public Rooms(String roomName, String roomDescription)
    {
        this.roomName = roomName;
        this.roomDescription = roomDescription;
        //this.roomObjects = roomObjects;
        this.roomObjects = new ArrayList<>();
        

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

    public ArrayList<String>  getObjects() {
        return roomObjects;
           }
        
        public void addObject(String item){
        roomObjects.add(item);
           }
        public void dropObject(String item){
        roomObjects.remove(item);
           }
        
       
        public void setContents(ArrayList<String> contents) {
        this.roomObjects = contents;
           }
       
        public int getNumberOfThings() {
        numberOfItems = roomObjects.size();
        return numberOfItems;
           }

    public String toString(){
        return (this.roomName +  this.roomDescription);
        }

  
    }
       

    


    
