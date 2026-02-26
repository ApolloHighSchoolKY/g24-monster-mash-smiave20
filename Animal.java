/**
 * Inheritance and Polymorphism
 ***********************************************************
 * This file is the original object that we are going to
 * create. All other objects will inherit all of the
 * properties and abilities this object has. In some cases,
 * we will override the existing methods we will create
 * here.
 ***********************************************************
 * @author  Mr. Leohr, February 7th, 2016
 */

//Parent Class
public class Animal
{
	private int age;
	private boolean alive;
	private String sound;

	    /**
	     * Create a new animal with age zero (a new born).
	     */
		//Defualt Constructer: assigns defualt values
		//Because a defualt Constructer is located in the Parent class, we are now not forced to write a constructer in the extended classes automatically. (But its still good to.)
	    public Animal()
	    {
			age = 0;
			alive = true;
			sound = "";
	    }

		//Modified Constructor
		//"Multi-parameter constructor"
		public Animal(int age, String sound){
			//The instance variable (age), located only in this class. Is being called by (this.)
			//The instance variable (sound), locate only in this class. Is being called by (this.)
			//These two specific variables are now being applied to the parameters in this modified constructer.
			this.age = age;
			this.sound = sound;
		}

	    /*
	    * Check whether the animal is alive or not.
	    * @return True if the animal is still alive.
	    */
        public boolean isAlive()
    	{
			//Boolean. Returns true because variable is set to true.
			//Otherwise, returns false.
			return alive;
    	}

     	/**
     	* Make the animal die :(
     	*/
		//This can not be used in toString()
     	public void kill()
     	{
			//void, no return type.
			//Alive was set to true. Making it false, "kills" the animal.
			alive = false;
     	}

		//Add a void eat() method in Animal that increases age.
		public void eat()
		{
			//void, no return type.
			//Is this correct???
			age++;
		}

     	/**
     	* Have the animal make a noise
     	* @return the string that is the animals sound it makes
     	*/
     	public String speak()
     	{
			//Returns the sound that was inputed.
     		return "" + sound;
     	}

		//Check how old the animal is.
		//Accesser Method
		public int getAge(){
			//Returns the number that age has been assigned.
			//int method, must return an int. (age is an int) 
			return age;
		}

		public String getSound()
		{
			return "" + sound;
		}


     	/**
     	* If you attempt to print the animal, if the animal is alive print its age and have it make
     	* a sound.  If the animal is dead, have it print how old it was when it died.
     	* @return String to be printed to the console.
     	*/
     	public String toString()
     	{
     		return "" + "The animal is " + isAlive() + "." + "Its age is " + getAge() + "." + "And the sound it makes is " + speak() + ".\n";
			//This says it is unreachable. Why????
			//return "" + "The animal was " + isAlive() + "." + "Its age was " + getAge() + ".\n";
     	}
}