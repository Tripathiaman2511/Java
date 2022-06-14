package Enumeration;
//autoboxing and auto-unboxing in expression
public class AutoBoxUnBox {
    public static void main(String[] args) {
        Integer obj1,obj2;
        int i;
        obj1=100;

        ++obj1;
        System.out.println(obj1);

        obj2=(obj1+obj1)/2;
        System.out.println(obj2);

        i=obj2+obj1;
        System.out.println(i);

    }
}
