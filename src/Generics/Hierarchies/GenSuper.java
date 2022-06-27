package Generics.Hierarchies;

public class GenSuper<T> {
    T ob;
    GenSuper(T ob){
        this.ob=ob;
    }
    T getob(){
        return ob;
    }
}
class Gen3<T> extends GenSuper<T>{
    Gen3(T ob){
        super(ob);

    }
    T getob2(){
        return ob;
    }
}
class GenSub<T,V> extends GenSuper<T>{
    V ob1;
    GenSub(T ob,V ob1){
        super(ob);
        this.ob1=ob1;
    }
    V getob1(){
        return ob1;
    }
}
