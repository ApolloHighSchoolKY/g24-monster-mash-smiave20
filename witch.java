public class Witch extends Monster
{
     //Modified constructer for the Witch class. 
    public Witch(String name){
        super(name);
    }
    
    //Override kill
    //MUST MATCH EVERYTHING PERFECTLY 
    //getName() is going back to the monster file to read parameter in its modifier.
    public String kill()
    {
        return getName() + " killed a victim. Screams were heard.\n";
    }

    public String fly()
    {
        return getName() + " went flying and cackling on her broomstrick.\n";
    }
}