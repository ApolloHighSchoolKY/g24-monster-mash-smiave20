public class MonsterMash
{
  public static void main(String[] args)
  {
    //Monster monster = new Monster(): //NOT ALLOWED
    //Because Monster has a modified constructer but not a defualt constructer,
    //Monster does not INHERIT a defualt constructer.
    Monster dracula = new Monster("Dracula");

    System.out.println(dracula);

    System.out.println(dracula.kill());


    //What we did together with Leohr.
    Monster sally = new Witch("Sally");

    System.out.println(sally);

    System.out.println(sally.kill());

    //This is specifying that sally is now a witch instead of a Monster.
    //.fly() is only located for a Witch. Not a Monster. Which this class can only read Monster.
    //So specifying allows the method from the witch to be applied in this method.
    //Taking something from the future and aplling it to the past
    System.out.println(((Witch)sally).fly());

    //Declare a Monster of your new type
    //Declare your new type of Monster
    Monster pauli = new Cyclops("Pauli");
 
    System.out.println(pauli);

    System.out.println(pauli.kill());
    
   //Connecting the main file to the "actions" you created in the new seporated class created.
    System.out.println(((Cyclops)pauli).destroyer());
  }
}
