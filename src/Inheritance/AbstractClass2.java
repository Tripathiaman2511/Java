package Inheritance;
abstract class Phone{
    public abstract void showConfig();
}
class Iphone extends Phone{
    public void showConfig(){
        System.out.println("2GB, IOS, 9.3");
    }
}
class SamsungS4 extends Phone{
    public void showConfig(){
        System.out.println("2GB, Lolipop");
    }
}
public class AbstractClass2 {
    public static void main(String[] args) {
        Iphone obj= new Iphone(); //creating an obj of type Iphone
        SamsungS4 obj1=new SamsungS4();
        show(obj1); //calling obj method show



    }    public static void show(Phone obj){  //creating obj of type Iphone
        obj.showConfig();
    }

}
