package Lambda.ConstructorReferences;
interface MyThirdFunc<R, T>{
    R func(T n);
}
class MySecondClass<T>{
    private T val;
    MySecondClass(T val){this.val=val;}

    T getVal(){return val;}
}
class MyNonGenClass{
    String str;
    MyNonGenClass(String str){this.str=str;}
    String getStr(){return str;}

}
public class ExampleCR {

    static <R,T>  R myClassFactory(MyThirdFunc<R,T> sf,T v){
        return sf.func(v);
    }

    public static void main(String[] args) {
        //ref to MySecondClass Constructor
        MyThirdFunc<MySecondClass<Double>,Double> myClassCons=MySecondClass<Double>::new;
        //instance of MySecondClass
        MySecondClass<Double> mc=myClassFactory(myClassCons,100.1);
        System.out.println(mc.getVal());

        MyThirdFunc<MyNonGenClass,String> myClassCons1=MyNonGenClass::new;
        MyNonGenClass mc1=myClassFactory(myClassCons1,"Hello");
        System.out.println(mc1.getStr());
    }
}
