package Lambda.ConstructorReferences;
interface MyFunc1<T>{
    MyClass1<T> func(T n);
}
class MyClass1<T>{
    private T val;
    MyClass1(T v){this.val=v;}
    MyClass1(){this.val=null;}

    T getVal(){return val;}

}
public class CRDemo2 {
    public static void main(String[] args) {
        MyFunc1<Integer> myClassCons=MyClass1::new;
        MyClass1<Integer> mc=myClassCons.func(100);
        System.out.println(mc.getVal());
    }
}
