/**
 * @(#)Farm.java
 *
 *
 * @author
 * @version 1.00 2023/3/8
 */
import java.util.ArrayList;

//ArrayList of Animals 
//Populate it with various types of Animals 
//Polymorphism- ta daa

public class Farm 
{

    public static void main(String[] args)
    {
        //Make an ArrayList and fill it with Animals.
        List farmArray = new ArrayList<Animal>();
        //Add an Aniaml, Cow and use them in a Loop
        farmArray.add(new Animal());
        farmArray.add(new Animal("Caw caw"));
        farmArray.add(new Cow());

        for(Animal x: animalFarm)
        {
            System.out.println(x.speack());
            System.out.println(x.eat());

            //Common way
            //Generic Way. Won't read specifics.
            //instanceof is saying that (x will only work with an instance of a cow). And only with that moment.
            if(x instanceof Cow)
            {
            System.out.println(((Cow)x).producedMilk(10));
            }

            /*
                Less common way

                This wil not reads different cows.More specific

                if(x.getClass() == Cow.class)
                    System.out.println("This is a Cow.");
            */
        }

        //For Parent Class
        Animal cheetah = new Animal("Cheetah");

        System.out.println(cheetah);

        System.out.println(cheetah.speak());

        //For Cow Extention
        Animal speckles = new Cow("Speckles");

        System.out.println(speckles);

        System.out.println(speckles.speak());

        //This method has special attrobutes in it that are not included in the Parent Class.
        //So this line is specifying, that Speckles (the cow version), is the one accessing this method.
        //Also this class can only read Animals. So this gives Animal access to the extintion we created and called (Cow).
        System.out.println(((Cow)speckles).eat());
    }
        
}