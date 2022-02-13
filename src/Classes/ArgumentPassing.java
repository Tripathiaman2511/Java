package Classes;
class Callbyvalue{
    int a,b;
    void meth(int i,int j){
        a*=2;
        b/=2;
    }
}
class Callbyreference{
    int a,b;
    Callbyreference(int i,int j){
        a=i;
        b=j;
    }
    void meth(Callbyreference obj){
        obj.a*=2;
        obj.b/=2;
    }

}
public class ArgumentPassing {
    public static void main(String[] args) {
        Callbyvalue cbv=new Callbyvalue();
        int num1=10,num2=20;
        System.out.println(num1+" "+num2);
        cbv.meth(num1,num2);
        System.out.println(num1+" "+num2);

        Callbyreference cbr=new Callbyreference(10,20);
        System.out.println(cbr.a+" "+cbr.b);
        cbr.meth(cbr);
        System.out.println(cbr.a+" "+cbr.b);
    }
}
