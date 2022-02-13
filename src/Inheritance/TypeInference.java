package Inheritance;


import java.io.FileReader;

class MainClass{
    void show(){
        System.out.println("Main Class...");
    }
}
class FristClass extends MainClass{
    int x;
}
class SecondClass extends FristClass{
    int y;
}

public class TypeInference {


    public static void main(String[] args) {
    var mc=getObj(0);
    var mc2=getObj(1);
    var mc3=getObj(2);
    //mc2.x=11;
    //mc3.y=12;
    }
    public static MainClass getObj(int which){
        switch(which){
            case 0:return new MainClass();
            case 1: return new FristClass();
            default: return new SecondClass();
        }
    }

}
