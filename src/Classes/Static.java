package Classes;

class DemoStatic{
    static int a=3;
    static int b;

    static void dosomething(){
        System.out.println("Doing something");
    }
    static{
        System.out.println("this will be called before any call");
        b=a*3;
    }
}
public class Static {

    public static void main(String[] args) {
        //No need of reference : call it by classname.method()
        DemoStatic.dosomething();
    }
}
