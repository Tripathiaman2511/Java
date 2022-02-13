package Classes;

class DemoAccessControl{
    //private : this will not be accessed by the other class but can be used by methods in the same class
    private final int num1;
    private final int num2;
    private int mul(int i,int j){
        return i*j;
    }
    DemoAccessControl(int i,int j){
        num1=i;
        num2=j;
    }
    public void domaths(){
        System.out.println(mul(num1,num2));
    }
}
public class AccessControl {
    public static void main(String[] args) {
        DemoAccessControl obj1=new DemoAccessControl(10,20);
        obj1.domaths();
    }
}
