package Lambda.MethodReferences;
interface StringFunc{
    String func(String str);
}

//Method Reference to Static Method
class MyStringOps{
    static String strReverse(String str){
        String result="";
        for(int i=str.length()-1;i>=0;i--){
            result+=str.charAt(i);

        }
        return result;
    }
}
public class MRtoStaticMethod {

    static  String stringOps(StringFunc sf,String s){
        return sf.func(s);
    }
    public static void main(String[] args) {
        String str="Hello Java!!!";
        //ClassName::methodName
        String outStr=stringOps(MyStringOps::strReverse,str);
        System.out.println(str);
        System.out.println(outStr);

    }
}
