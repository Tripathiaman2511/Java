package Generics.Hierarchies;

public class HierarDemo3 {
    public static void main(String[] args) {
        GenSuper<Integer> iob=new GenSuper<>(11);

        Gen3<Integer> iob2=new Gen3<>(12);
        GenSub<Integer,String> ob2=new GenSub<>(11,"Hello");
        //Checking type at run-time
         if(iob instanceof GenSuper<?>)
             System.out.println("true");

         if(iob instanceof GenSub<?,?>)
             System.out.println("False");

         //casting
        GenSuper<Integer> iob21 = iob2;
    }
}
