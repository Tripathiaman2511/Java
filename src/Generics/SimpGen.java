package Generics;

class TwoGen<T,V>{
    T obj1;
    V obj2;

    TwoGen(T obj1, V obj2){
        this.obj1=obj1;
        this.obj2=obj2;

    }

    void showType(){
        System.out.println("Type of T is: "+obj1.getClass().getName()+"\nType of V is: "+obj2.getClass().getName());

    }

    T getObj1(){
        return obj1;
    }

    V getObj2(){
        return obj2;
    }


}
public class SimpGen {
    public static void main(String[] args) {
        TwoGen<Integer,String> refobj1=new TwoGen<Integer,String>(12,"hello");
        refobj1.showType();

        int value1=refobj1.getObj1();
        System.out.println(value1);

        String value2=refobj1.getObj2();
        System.out.println(value2);



    }
}
