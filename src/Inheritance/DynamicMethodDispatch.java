package Inheritance;
class A2{
    int i,j;
    A2(int a,int b){
        i=a;
        j=b;
    }
    int add(){
        return i+j;
    }
}
class B2 extends A2{

    B2(int a,int b){
        super(a,b);

    }
    void config(){
        System.out.println("Config");
    }
    int add(){
        return i+j;
    }
}
public class DynamicMethodDispatch {
    public static void main(String[] args) {
        //Here we are referring obj1 to A2 but creating of type B2
        A2 obj1=new B2(1,1);
        obj1.add();
        //this will not run
        //since the reference variable A2 doesn't know about config method
        //obj1.config();



    }
}
