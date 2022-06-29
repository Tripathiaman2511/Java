package Lambda.MethodReferences;
interface NewFunc<T>{
    int func(T[] vals,T v);
}

class MyArrayOps{
    static <T> int countMatching(T[] vals,T v) {
        int count = 0;
        for (T val : vals) {
            if (val == v) count++;
        }
        return count;
    }
}

public class MRWithGenerics {
    static <T> int  myOps(NewFunc<T> f,T[] vals,T v){
        return f.func(vals,v);
    }
    public static void main(String[] args) {
        Integer[] vals={1,2,3,4,5,2,3,7,8};
        String[] str={"one","two","three","two","two"};
        int count;

        count=myOps(MyArrayOps::countMatching,vals,4);
        System.out.println("Total count of 4s: "+count);

        count=myOps(MyArrayOps::countMatching,str,"two");
        System.out.println("Total count of twos: "+count);
    }
}
