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
   //getSound() is going back to the Parent Class (Animal)
   public String speak()
   {
        return "" + getSound();
   }

   //Override eat() so that every time the cow eats, 
   //it also increases its milkProduced total.
   public void eat()
   {
        //Cow eats, increase age by one (super)
        //This is connecting the Cow extention to the Parent Class (Animal) 
        //to allow it access to the eat method to increase age in Cow.
        super.eat();

        //When the Cow eats, its milkProduce increases as well. 
        milkProduced++;
   }
}