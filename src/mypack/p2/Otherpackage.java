package mypack.p2;

import mypack.p1.Protection;

public class Otherpackage {
    Otherpackage(){
        Protection P=new Protection();
        System.out.println("other packageConstructor");

        //Default
        //System.out.println(P.n);
        //Private
        //System.out.println(P.n_pri);
        //Protected
        //System.out.println(P.n_pro);
        //Public
        System.out.println(P.n_pub);
    }


}
