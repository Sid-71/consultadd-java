// an abstract function should have abstract class
// an abstract class have both abstract and non abstract methods


abstract class Car{
    public abstract void drive();
    public abstract void fly();
    public void playMusic()
    {
        System.out.println("this will have some functioning of music");
    }
}
// you will have to implement abstract funcitons of abstract base class

// but what if i am still not able to make fly funciton so 
// so i willm make this class as abstract;
 abstract class WagonR extends Car{
    public void drive()
    {
        System.out.println("some functioning of driving");
    }
}



// concrete class
// we can create object of concrete class
class updatedWagonR extends WagonR{

    public void fly() {
      System.out.println("some functioning in flying ");
    }

}

class abs{
    public static void main(String args[])
    {
        Car ob = new updatedWagonR();
        ob.drive();
        ob.playMusic();
        ob.fly();

    }
}