public class Rooms
{
    public String roomName;
    public String roomDescription;

    public Rooms(String roomName, String roomDescription,)
    {
        this.roomName = roomName;
        this.roomDescription = roomDescription;

    }

    public String getName()
    {
        return this.roomName;
    }
    
    public String getDescription()
    {
        return this.roomDescription;
    }




    public String toString(){
        return (this.roomName +  this.roomDescription);
        }

  
    }
       

    


    
