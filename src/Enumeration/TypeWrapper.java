package Enumeration;



public class TypeWrapper {
    public static void main(String[] args) {
        char a='a';

        Character ch=Character.valueOf(a);
        char ans=ch.charValue();
        System.out.println(ans);

        Boolean b1=Boolean.valueOf(true);
        Boolean b2=Boolean.valueOf("false");
        System.out.println(b1+" "+b2);

        Integer in=Integer.valueOf(1);
        //unboxing
        System.out.println(in.intValue());
    }
}
