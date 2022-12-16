public class Object {

    public String roomObjects;
    public String objectDescriptions;

    public Object(String roomObjects, String objectDescriptions) {
        this.roomObjects = roomObjects;
        this.objectDescriptions = objectDescriptions;

    }

    public String getObject() {
        return this.roomObjects;
    }

    public String objectDescription() {
        return this.objectDescriptions;
    }

    public String toString() {
        return (this.roomObjects + this.objectDescriptions);
    }

    public String action() {
        if (this.roomObjects.equals("ROCKING HORSE \n")) {
            return "You approach the rocking horse cautiously, inspecting it the entire time. It's made of wood with the once colorful paint now chipping off. \n The air around you is suddenly colder than before. The horse begins to rock back and forth. \n You blink, and its back in it's original position.";
        } else if (this.roomObjects.equals("BROKEN MIRROR \n")) {
            return "You step towards the broken mirror, looking at yourself with the cracked lines obscuring your view. There seems to be a figure behind you. It starts in the far corner, but it gets larger as it approaches. \n You turn around, but nothing is there. It must've just been your eyes seeing things. \n Right?";
        } else if (this.roomObjects.equals("OLD VANITY \n")) {
            return "You look at the vintage vanity. The wood is covered in dust and dead bugs, most likely rotting underneath all the dirt. The mirror is so dirty you can't see anything. \n Nothing alarms you.";
        } else if (this.roomObjects.equals("BABY DOLL \n")) {
            return "The baby doll sits on the bed, propped up so it looks as if it's looking at you. As you step closer, the open mouth meant for a baby bottle turns into a smirk. \n A chill runs down your spine. The mouth is now stuck in a smile";
        } else if (this.roomObjects.equals("HAND MIRROR \n")) {
            return "You approach the fire place mantel where a hand mirror is laying flat. The bronze handle looks as if it was just washed and polished. \n You pick it up. \n You stare at yourself for a moment. Nothing seems to happen.";
        } else if (this.roomObjects.equals("BALLERINA JEWELRY BOX \n")) {
            return "Atop of Sally's vanity, there is a jewelery box with a ballerina figurine. It's perminently posed on one leg with her arms above her head. \n You reach to pick it up. \n Before you get the chance, the ballerina begins to slowly spin as some notes play.";
        } else if (this.roomObjects.equals("CREEPY PORTRAIT \n")) {
            return "j";
        } else if (this.roomObjects.equals("RUSTY KNIFE \n")) {
            return "j";
        } else if (this.roomObjects.equals("OLD NEWSPAPER \n")) {
            return "j";
        } else if (this.roomObjects.equals("CREAKY CHAIR \n")) {
            return "j";
        } else if (this.roomObjects.equals("DUFFLE BAG \n")) {
            return "j";
        } else if (this.roomObjects.equals("BROKEN GRANDFATHER CLOCK \n")) {
            return "j";
        } else {
            return "Sorry, we could not find that object";
        }
    }
}
