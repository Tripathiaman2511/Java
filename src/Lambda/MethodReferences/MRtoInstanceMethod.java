package Lambda.MethodReferences;
interface StringFunc1{
    String func(String str);
}

class MyStringOp{
    String strReverse(String str){
        String result="";
        for(int i=str.length()-1;i>=0;i--){
            result+=str.charAt(i);

        }
        return result;
    }
}
public class MRtoInstanceMethod {
    static  String stringOps(StringFunc1 sf,String s) {
        return sf.func(s);
    }
    public static void main(String[] args) {
        String str="Hello Java!!!";
        MyStringOp strOps=new MyStringOp();

        //objRef::methodName
        String outStr=stringOps(strOps::strReverse,str);
        System.out.println(outStr);

    }
}
