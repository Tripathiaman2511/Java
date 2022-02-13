package mypack.p1;

public class Derived extends Protection{
    Derived(){
        System.out.println("Derived Constructor");
        System.out.println(n);
        //Class Only
        //System.out.println(n_pri);

        System.out.println(n_pro);
        System.out.println(n_pub);
    }
}
