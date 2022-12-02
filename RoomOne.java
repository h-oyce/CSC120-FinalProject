public class RoomOne extends Rooms {

    private String rmName = "The Attic";
    private String rmDescription = "It's too quiet in here, you can hear every creak and shuffle..." ;
    private String[] rmObjects = {"Spider webs, Packed boxes, Rocking Chair"};



    public String roomName() {
        return rmName;
    }

    public String roomDescription(){
        return rmDescription;
    }

    public String[] roomObjects() {
        return this.rmObjects;
    }
  
}
