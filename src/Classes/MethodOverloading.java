package Classes;
//Method Overloading: parameter and type
class  Overloadingmethod{
    void test(){
        System.out.println("No parameters");
    }
    void test(int a){
        System.out.println("value of a: "+a);
    }


    void test(int a,int b){
        System.out.println("Value of a and b is: "+a+" "+b);
    }
    double test(double a , double b){
        return a+b;
    }

    void test(double a,double b,double c){
        System.out.println(a+b+c);
    }
}
public class MethodOverloading {
    public static void main(String[] args) {
        int x=88,y=12,z=15; //Java can do automatic type conversion
        Overloadingmethod exp1=new Overloadingmethod();
        exp1.test();
        exp1.test(12);
        exp1.test(12,13);
        exp1.test(x,y,z);
        System.out.println(exp1.test(12.4,13.2));
    }
}
