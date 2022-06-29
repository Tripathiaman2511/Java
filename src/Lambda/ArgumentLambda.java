package Lambda;



interface StringFunc1 {
    String func(String n);
}
public class ArgumentLambda {
    static String stringOp(StringFunc1 sf,String s){
        return sf.func(s);
    }

    public static void main(String[] args) {
        String inStr="Lambdas add power to java";
        String outStr;
        System.out.println("Here is the input string: "+inStr);

        outStr=stringOp(str->str.toUpperCase(), inStr);
        System.out.println("String in uppercase: "+outStr);

        outStr=stringOp(str->{
         String result="";
         for(int i=0;i<str.length();i++){
             if(str.charAt(i)!=' ')
                 result+=str.charAt(i);

         }
         return result;
        },inStr);

        System.out.println("String with no space: "+outStr);

        StringFunc1 reverse=(str)->{
            String result="";
            for(int i=str.length()-1;i>=0;i--){
                result+=str.charAt(i); //use stringbuilder
            }
            return result;
        };
        System.out.println("String reversed: "+stringOp(reverse,inStr));



    }
}
