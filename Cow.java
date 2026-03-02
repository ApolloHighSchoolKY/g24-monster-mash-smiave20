/**
 * Inheritance and Polymorphism
 ***********************************************************
 * This file is an object that will inherit all of the
 * properties and abilities of the original Animal object.
 * However, it will have it own unique properties and
 * methods while overriding some of the existing methods
 * it inherits.
 ***********************************************************
 * @author  Mr. Leohr, February 7th, 2016
 */


public class Cow extends Animal
{
    //Instance Field
    private double milkProduced;

    public Cow()
    {
        //Defualt cow, is going through super to get the ability to make a sound from Animal. 
        //And now the cow is able to say its "Moo".
        super("Moo");
        milkProduced = 0;
    }

    //Modified Constructor 
    //Cow speaks
    public Cow(String sound)
    {
        //This allows access to the sound from the Parent class. (Animal)
        super(sound);
    }

   //Override speak() to include cow-specific information.
   //MUST MATCH EVERYTHING PERFECTLY FROM THE PARENT CLASS!
   //This does because it will return the sound inputed to the instance variable (sound).
   //super.speak() is going back to the Parent Class (Animal) to access sounds to enable speaking mobility for the cow.
   public String speak()
   {
        return "" + super.speak();
   }

   //Override eat() so that every time the cow eats, 
   //it also increases its milkProduced total.
   public String eat()
   {
        //Cow eats, increase age by one (super)
        //This is connecting the Cow extention to the Parent Class (Animal) 
        //to allow it access to the eat method to increase age in Cow.
        super.eat();

        //When the Cow eats, its milkProduce increases as well. 
        milkProduced+= 10;

        milkProduced=milkProduced;
        
        //More specific to a cow 
        return "The cow ate and produced milk.";
   }

   public String producedMilk(int x)
   {
        milkProduced += x;
        return "The Cow produced " + x + " more milk. ";
   }

   public String toString()
    {
        //If the statement in the method isAlive() in the Parent Class (Animal) is true, then return the statement listed below.
		if(super.isAlive())
		{
			return super.toString() + "\nMilk produced: " + milkProduced;
		}

        //Else, the statement in the method in the Parent Class (Animal) is false. Return this statement instead listed below.
		return "" + "The Cow was " + super.getAlive() + "years old when it passed away." + "The milk that it produced " + milkProduced + ".\n";
 	}
}