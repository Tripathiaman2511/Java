package ExceptionHandling;
class MethNestTry{
    static void nesttry(int a){
        try{
            int b=42/a;
            System.out.println(b);
            try{
                if(a==1) a=a/(a-a);
                if(a==2){
                    int c[]={1};
                    c[42]=99;
                }

            }catch(ArrayIndexOutOfBoundsException e){
                System.out.println(e);
            }
        }catch(ArithmeticException e){
            System.out.println(e);
        }
    }
}
public class NestedTryMethod {
    public static void main(String[] args) {
        MethNestTry.nesttry(0);
        MethNestTry.nesttry(1);
        MethNestTry.nesttry(2);
    }
}
