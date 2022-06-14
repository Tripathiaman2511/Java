package Enumeration;
enum Fruits{
    Apple(10),Mango(1), Banana(1),Grapes(11),DragonFruit; //DragonFruit is default enum constant

    //instance variable
    private int price;

    //constructor
    Fruits(int p){
        price=p;
    }
    //overloading
    Fruits(){
        price=-1;
    }
    //method
    int getPrice(){
        return  price;
    }

}
public class EnumDemo2 {
    public static void main(String[] args) {
        Fruits fp;
        System.out.println("Apple Cost: "+Fruits.Apple.getPrice());
        System.out.println("For all Fruits price");
        for(Fruits f: Fruits.values()){
            System.out.println(f+" "+f.getPrice());
        }
        //position of enum constant - ordinal()
        System.out.println(Fruits.Apple.ordinal());

        //compare
        // 0
        System.out.println(Fruits.Apple.compareTo(Fruits.Apple));

        // -1
        System.out.println(Fruits.Apple.compareTo(Fruits.Mango));

        //positive value
        System.out.println(Fruits.Mango.compareTo(Fruits.Apple));

    }
}