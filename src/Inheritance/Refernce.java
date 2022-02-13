package Inheritance;
class Box{
    double width;
    double height;
    double depth;

    Box(Box obj){
        width=obj.width;
        height=obj.height;
        depth =obj.depth;
    }
    Box(double w,double h, double d){
        width=w;
        height=h;
        depth=d;
    }
    Box(){
        width=height=depth=-1;
    }
    Box(double len){
        width=depth=height=-1;
    }
    double volume(){
        return width*height*depth;
    }
}
class BoxWeight extends Box{
    double weight;
    //Default Constructor
    BoxWeight(){
        super();
        weight=-1;

    }
    BoxWeight(BoxWeight ob){
        super(ob);
        weight=ob.weight;
    }

    BoxWeight(double len, double m){
        super(len);
        weight=m;
    }

    BoxWeight(double w,double h,double d,double m){
        width=w;
        height=h;
        depth=d;
        weight=m;
    }

}

public class Refernce {
    public static void main(String[] args) {
        BoxWeight weightbox=new BoxWeight(3,5,7,10);
        BoxWeight clone=new BoxWeight(weightbox);
        Box plainbox=new Box();
        double vol;
        vol=weightbox.volume();
        System.out.println("volume of wieghted box is "+vol);
        System.out.println("weight of weighted box is "+weightbox.weight);
        System.out.println();

        //Superclass variable can reference a subclass object
        plainbox=weightbox;

        vol=plainbox.volume();
        System.out.println("volume of plainbox "+vol);


        System.out.println("Clone Box "+clone.volume());

    }
}
