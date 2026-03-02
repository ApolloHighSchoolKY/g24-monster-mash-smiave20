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
			//Transfering sound to modifier constructer
			this("Sound");
	    }

		//Modified Constructor
		//"Multi-parameter constructor"
		public Animal(String sound){
			//The instance variable (sound), locate only in this class. Is being called by (this.)
			//This specific variable is now being applied to the parameter in this modified constructer.
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
		public String eat()
		{
			//void, no return type.
			//Accumulates age the variable to increase by one.
			age++;

			//Very basic because the animal is basic.
			return "The Animal ate.";
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

		//Do not need this becasue of speak. Same code, adding this is unnecessary.
		/*public String getSound()
		{ 
			return "" + sound;
		}
		*/

     	/**
     	* If you attempt to print the animal, if the animal is alive print its age and have it make
     	* a sound.  If the animal is dead, have it print how old it was when it died.
     	* @return String to be printed to the console.
     	*/
     	public String toString()
     	{
			//Can have a if statement in the toString. Its Okay.

			//alive is set to true.
			//If alive, return the statement written.
			if(alive)
			{
				return "" + "The animal is " + isAlive() + " years old." + "Its age is " + getAge() + "." + "And the sound it makes is " + speak() + ".\n";
			}
     		
			//Else (dead), Return this statement instead.
			return "" + "The animal was " + isAlive() + " years old." + "Its age was " + getAge() + " when it passed.\n";
     	}
}