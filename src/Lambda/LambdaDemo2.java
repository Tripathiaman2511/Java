package Lambda;
//to demonstrate block lambdas
interface NumericFunc{
    int func(int n);
}

interface StringFunc{
    String func(String n);
}
public class LambdaDemo2 {
    public static void main(String[] args) {
        NumericFunc factorial=(n)->{
            int result=1;
            for(int i=1;i<=n;i++){
                result*=i;
            }
            return result;
        };

        System.out.println(factorial.func(3));
        System.out.println(factorial.func(5));

        StringFunc Reverse=(n)->{
            String result="";
            for(int i=n.length()-1;i>=0;i--){
                result+=n.charAt(i); //use stringbuilder
            }
            return result;
        };

        System.out.println(Reverse.func("hello"));
    }
}
