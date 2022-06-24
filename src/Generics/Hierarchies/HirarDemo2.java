package Generics.Hierarchies;

class NonJen{
    int num;
    NonJen(int num){
        this.num=num;
    }
    int getNum(){
        return num;
    }
}
class Gen2<T> extends NonJen{
    T ob;
    Gen2(T ob,int num){
        super(num);
        this.ob=ob;
    }
    T getOb(){
        return ob;
    }
}
public class HirarDemo2 {
    public static void main(String[] args) {
        Gen2<String> HirarValue2=new Gen2<>("Hello",179);
        System.out.print(HirarValue2.getOb()+" ");
        System.out.println(HirarValue2.getNum());
    }
}
