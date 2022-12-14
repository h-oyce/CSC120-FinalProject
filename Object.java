public class Object {

    public String roomObjects;
    public String objectDescriptions;

    public Object(String roomObjects, String objectDescriptions)
    {
        this.roomObjects = roomObjects;
        this.objectDescriptions = objectDescriptions;
        
    }

    public String getObject()
    {
        return this.roomObjects;
    }

    public String objectDescription()
    {
    return this.objectDescriptions;
}

public String addString(){
    return (this.roomObjects + this.objectDescriptions);
}

    
}
