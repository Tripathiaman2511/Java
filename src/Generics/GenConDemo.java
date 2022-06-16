package Generics;
class GenCons{
    private double val;
    <T extends Number> GenCons(T arg){
        val= arg.doubleValue();
    }
    void showAll(){
        System.out.println(val);
    }
}
public class GenConDemo {
    public static void main(String[] args) {
        GenCons test1=new GenCons(100);
        GenCons test2=new GenCons(12.3F);
        test1.showAll();
        test2.showAll();
    }
}
