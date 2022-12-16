/*
 * Object class
 * Contains the attributes and constructor of Object, so we can create instances of objects in the GameLoop for the Player to interact with.
 * @param String roomObjects, String objectDescriptions
 * @return Prints information of the Object instances that Player can interact with as they explore.
 */
 

public class Object {

    public String roomObjects;
    public String objectDescriptions;

    /*Constructor */
    public Object(String roomObjects, String objectDescriptions)
    {
        this.roomObjects = roomObjects;
        this.objectDescriptions = objectDescriptions;
        
    }

    /*Accessors */
    public String getObject()
    {
        return this.roomObjects;
    }

    public String objectDescription()
    {
    return this.objectDescriptions;
}


public String toString(){ //prints out the object name and the object description
    return(this.roomObjects + this.objectDescriptions);
}

    
}
