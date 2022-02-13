package Inheritance;

class A{
    int i;

}
class B extends A{
    int i;
    B(int a,int b){
        super.i=a;
        i=b;
    }
    void Show(){
        System.out.println("i from superclass: "+super.i);
        System.out.println("i form subclass: "+i);
    }
}
public class SecondSuper {
    public static void main(String[] args) {
        B obj=new B(1,2);
        obj.Show();
    }
}
