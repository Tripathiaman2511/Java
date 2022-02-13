package mypack.p2;



public class Protection2 extends mypack.p1.Protection {
    Protection2(){
        System.out.println("Derived other package constructor");
        //default
        //System.out.println(n);
        //private
        //System.out.println(n_pri);
        //protected
        System.out.println(n_pro);
        //public
        System.out.println(n_pub);
    }

}
