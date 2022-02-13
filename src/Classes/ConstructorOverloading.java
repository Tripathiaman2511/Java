package Classes;
//for understanding constructor overloading go to method overloading and constructor class
//Constructor Overloading same as method overloading
class Overloadingconstructor{
    double width;
    double height;
    double breadth;

    Overloadingconstructor(double width,double breadth, double height){
        this.width=width;
        this.breadth=breadth;
        this.height=height;
    }
    Overloadingconstructor(){
        width=height=breadth=-1;
    }
    Overloadingconstructor(double value){
        width=breadth=height=value;
    }
    double Volume(){
        return width*breadth*height;
    }
}
public class ConstructorOverloading {
    public static void main(String[] args) {
        Overloadingconstructor exp1=new Overloadingconstructor(12,31,14);
        Overloadingconstructor exp2=new Overloadingconstructor();
        Overloadingconstructor exp3=new Overloadingconstructor(12);
        System.out.println(exp1.Volume() + " "+exp2.Volume()+" "+exp3.Volume());
    }
}
