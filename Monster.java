public class Monster
{
  //Instance Field
  private String myName;

  public Monster(){
    myName = "Monster";
  }
  
  public Monster( String name ) {
      myName = name;
  }

  public String getName(){
    return myName;
  }

  public String kill(){
    return myName + " killed a victim.  Screams were heard.\n";
  }

  public String toString() {
     return "Monster name :: " + myName + "\n";
  }
}