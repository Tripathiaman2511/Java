package Inheritance;
class Superclass{
    int i;
    int j;
    void show(){
        System.out.println(i+" "+j);
    }
}
class Subclass extends Superclass{
    int k;
    void sum(){
        System.out.println(i+j+k);
    }
}

public class BasicInheritance{
    public static void main(String[] args) {
        Superclass obj1=new Superclass();
        Subclass obj2=new Subclass();
        obj1.i=11;
        obj1.j=12;
        obj1.show();
        System.out.println();
        obj2.i=1;
        obj2.j=111;
        obj2.k=23;
        obj2.sum();
    }
}
