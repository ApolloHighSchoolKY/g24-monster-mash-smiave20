public class Cyclops extends Monster{

     //Add an instance field.(variable) 
     public String inputName;

     //Modified constructer for the Witch class.
    public Cyclops(String name){
        super(name);
        inputName = "";
        
    }

    //Override kill
    //MUST MATCH EVERYTHING PERFECTLY 
    //getName() is going back to the monster file to read parameter in its modifier.
    public String kill()
    {
        return getName() + " killed a victim.  Screams were heard.\n";
    }

    public String fly()
    {
        return getName() + " shot lasers out of his eye, and laughed while victim burned.\n";
    }

    //Modified Constructor: Assign values to all instance variables and instantiate all objects
    public destroyer(String name)
    {
        //Assigning the instance field (variable) a value.
        inputName = name;

        return "The cyclops picked up " + inputName + " and ate them. Thinking " + inputName + " tasted delicious.\n";
    }
    
}