package Inheritance;
class A1{
    int i,j;
    A1(int i,int j){
        this.i=i;
        this.j=j;
    }
    void show(){
        System.out.println("Value of i: "+this.i+"\nValue of j: "+this.j);
    }
}
class B1 extends A1{
    int k;
    B1(int i,int j,int k){
        super(i,j);
        this.k=k;
    }
    void show(){
        super.show();
        System.out.println("Value of k: "+this.k);
    }
}

public class MethodOverriding {
    public static void main(String[] args) {
        B1 obj=new B1(1,2,3);
        obj.show();
    }
}
