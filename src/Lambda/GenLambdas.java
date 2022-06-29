package Lambda;

//Using Generic Interface
interface SomeFunc<T>{
T func(T n);
}
public class GenLambdas {
    public static void main(String[] args) {
        SomeFunc<StringBuilder> reverse=(n)->{
            StringBuilder result=new StringBuilder();

            for(int i=n.length()-1;i>=0;i--){
                result.append(n.charAt(i));
            }
            return result;
        };
        System.out.println(reverse.func(new StringBuilder("Racecar")));

        SomeFunc<Integer> factorial=(n)->{
            int result=1;
            for(int i=1;i<=n;i++){
                result*=i;
            }
            return result;
        };
        System.out.println(factorial.func(5));
    }
}
