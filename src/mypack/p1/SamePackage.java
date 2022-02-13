package mypack.p1;

public class SamePackage {
    SamePackage(){
        Protection P = new Protection();
        System.out.println("Same Package Constructor");
        System.out.println(P.n);
        //Class Only
        //System.out.println(P.n_pri);
        System.out.println(P.n_pro);
        System.out.println(P.n_pub);
    }
}
