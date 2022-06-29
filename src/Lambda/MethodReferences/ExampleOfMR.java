package Lambda.MethodReferences;

import java.util.ArrayList;
import java.util.Collections;

class MyClass{
    int val;
    MyClass(int val){this.val=val;}
    int getVal(){return val;}
}
class UseMethodRef{
    static int CompareMC(MyClass a,MyClass b){
        return a.getVal()-b.getVal();
    }
}
public class ExampleOfMR {
    public static void main(String[] args) {
        ArrayList<MyClass> a1=new ArrayList<>();
        a1.add(new MyClass(1));
        a1.add(new MyClass(12));
        a1.add(new MyClass(11));
        a1.add(new MyClass(2));

        MyClass maxObj= Collections.max(a1,UseMethodRef::CompareMC);
        System.out.println(maxObj.getVal());
    }
}
