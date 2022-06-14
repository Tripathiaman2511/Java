package Enumeration;

public class Autoboxing {
    static int m(Integer v){
        return v;//auto-boxing
    }
    public static void main(String[] args) {
        //No need to wrap manually and extract manually, Java do this for you.
        //Autoboxing
        Integer obj=100;
        System.out.println(obj);
        //Auto-unboxing
        int ref=obj;
        System.out.println(obj);

        Integer obj1=m(100); //auto-unboxing
        System.out.println(obj1);
    }
}
