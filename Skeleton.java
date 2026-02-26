public class Skeleton extends Monster
{
     //Add an instance field.(variable) 
     private double speed;;

     public Skeleton(){
        speed = 100;
     }
     
     //Modified constructer for the Witch class.
     //SUPER MUST BE FIRST ALWAYS WHEN IMPLEMENTED!!!!!
    public Skeleton(String name){
        super(name);
        speed = 100;
    }

    public Skeleton(String name, double speed){
        //Name from the parent class.
        super(name);

        //Returns the speed that was inputed
        //(this.speed) is the instance variable located in this class.
        //Scope.
        this.speed = speed;
    }

    public String toString(){
        //Go to the parent class and find the .toString() there and run it.
        return "" + super.toString() + "Speed ::" + speed;
    }
}