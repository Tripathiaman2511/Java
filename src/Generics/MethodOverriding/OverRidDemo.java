package Generics.MethodOverriding;
class Gen<T>{
    T ob;
    Gen(T ob){
        this.ob= ob;
    }
    T getOb(){
        System.out.print("Gen's getOb(): ");
        return ob;
    }
}
class Gen2<T> extends Gen<T>{
    Gen2(T ob){
        super(ob);
    }

    T getOb(){
        System.out.print("Gen2's getOb(): ");
        return ob;
    }
}
public class OverRidDemo {
    public static void main(String[] args) {
        Gen<Integer> iob=new Gen<>(11);
        System.out.println(iob.getOb());

        Gen2<String> strOb=new Gen2<>("Hello");
        System.out.println(strOb.getOb());
    }
}
