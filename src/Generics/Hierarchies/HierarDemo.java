package Generics.Hierarchies;

public class HierarDemo {
    public static void main(String[] args) {
        GenSub<String,Integer> hirarValue=new GenSub<>("Hello",79);
        System.out.print(hirarValue.getob()+" ");
        System.out.println(hirarValue.getob1());
    }
}
