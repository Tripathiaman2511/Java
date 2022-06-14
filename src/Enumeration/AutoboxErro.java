package Enumeration;
//Auto/unbox Prevent Errors
public class AutoboxErro {
    public static void main(String[] args) {
        Integer obj3=1000;
        int i=obj3.byteValue();
        System.out.println(i);
    }
}
