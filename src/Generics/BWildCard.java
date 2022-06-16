package Generics;
class TwoD{
    int X,Y;
    TwoD(int X,int Y){
        this.X=X;
        this.Y=Y;

    }
}

class ThreeD extends TwoD{
    int Z;
    ThreeD(int X,int Y,int Z){
        super(X,Y);
        this.Z=Z;
    }

}

class FourD extends ThreeD{
    int T;
    FourD(int X,int Y,int Z,int T){
        super(X,Y,Z);
        this.T=T;

    }
}

class CoOrds<T extends TwoD>{
    T[] coOrds;
    CoOrds(T[] coOrds){
        this.coOrds=coOrds;
    }
}
public class BWildCard {
    static void showXY(CoOrds<?> c){
        System.out.println("X Y Coordinates");
        for(int i=0;i<c.coOrds.length;i++){
            System.out.println(c.coOrds[i].X+" "+c.coOrds[i].Y);

        }
        System.out.println();
    }

    static void showXYZ(CoOrds<? extends ThreeD> c){
        System.out.println("X Y Z Coordinates");
        for(int i=0;i<c.coOrds.length;i++){
            System.out.println(c.coOrds[i].X+" "+c.coOrds[i].Y+" "+c.coOrds[i].Z);

        }
        System.out.println();
    }

    static void showXYZT(CoOrds<? extends FourD> c){
        System.out.println("X Y Z T Coordinates");
        for(int i=0;i<c.coOrds.length;i++){
            System.out.println(c.coOrds[i].X+" "+c.coOrds[i].Y+" "+c.coOrds[i].Z+" "+c.coOrds[i].T);

        }
        System.out.println();
    }

    public static void main(String[] args) {
        TwoD[] td={new TwoD(0,0),new TwoD(7,9),new TwoD(18,4),new TwoD(-1,43)};

        CoOrds<TwoD> tdLocs=new CoOrds<>(td);
        System.out.println("Contents of tdLocs: ");
        showXY(tdLocs);

        FourD[] fd={new FourD(0,0,0,0),new FourD(1,4,2,7),new FourD(19,12,16,22),new FourD(-1,-14,12,-22)};

        CoOrds<FourD> fdLocs=new CoOrds<>(fd);
        System.out.println("Contents of fdLocs: ");
        showXY(fdLocs);
        showXYZ(fdLocs);
        showXYZT(fdLocs);
    }
}
