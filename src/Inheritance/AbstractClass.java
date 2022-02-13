package Inheritance;


abstract class MaheshPhones{                            //abstract class
    //Defined Method
    public void call(){
        System.out.println("Calling...");
    }
    public abstract void move(); //Abstract Methods
    public abstract void cook();
    public abstract void dance();
}
abstract class Ramesh extends MaheshPhones{         //abstract class

    @Override
    public void move() {
        System.out.println("Moving...");
    }
}

class Suresh extends Ramesh{                    //Concrete Class
    public void cook() {
        System.out.println("Cooking...");

    }
    public void dance(){
        System.out.println("Dancing... ");
    }
}
public class AbstractClass {
    public static void main(String[] args) {

        MaheshPhones obj=new Suresh(); //cannot instantiate the abstract class
        obj.call();
        obj.cook();
        obj.move();
        obj.dance();
    }
}
