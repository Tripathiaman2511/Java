package Inheritance;
//including the class - Box and BoxWeight for Reference.java
class Shipment extends BoxWeight{
    double cost;
    Shipment(Shipment obj){
        super(obj);
        cost=obj.cost;
    }

    Shipment(double w, double h, double d, double m, double c){
        super(w,h,d,m);
        cost=c;
    }

    Shipment(){
        super();
        cost=-1;
    }

    Shipment(double len, double m, double c){
        super(len,m);
        cost=c;
    }

}
public class MultiLevel {
    public static void main(String[] args) {
        Shipment ship1= new Shipment(10,20,30,40,112.2);
        Shipment ship2= new Shipment(11,11,11,12,100);

        double vol;
        System.out.println("Shipment 1 volume "+ship1.volume());
        System.out.println("Cost of Shipment 1: "+ship1.cost);
        System.out.println("Weight of Shipment 1: "+ship1.weight);
        System.out.println();
        System.out.println("Shipment 2 volume "+ship2.volume());
        System.out.println("Cost of Shipment 2: "+ship2.cost);
        System.out.println("Weight of Shipment 2: "+ship2.weight);
    }

}
