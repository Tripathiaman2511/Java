package Lambda.ConstructorReferences;

interface MyFunc{
    MyClass func(int n);
}
class  MyClass{
    private int val;
    MyClass(int val){this.val=val;}
    MyClass(){val=0;}
    int getVal(){return val;}
}
public class CRDemo {
    public static void main(String[] args) {
        //Classname::new
        //constructor reference
      //  MyFunc refObj=(n)->new MyClass(n);
        MyFunc refObj=MyClass::new;
        MyClass mc=refObj.func(10);
       // System.out.println(refObj.func(10).getVal());
        System.out.println("value of mc is: "+mc.getVal());
    }
}
