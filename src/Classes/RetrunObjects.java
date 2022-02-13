package Classes;
class Test{
    int a;
    Test(int i){
        a=i;
    }
    Test incrByTen(){
        Test temp=new Test(a+10);
        System.out.println(temp);
        return temp;
    }
}

public class RetrunObjects {
    public static void main(String[] args) {
        Test obj1=new Test(2);
        Test obj2;
        obj2=obj1.incrByTen();
        System.out.println(obj1.a);

        System.out.println(obj2.a);
        obj2=obj2.incrByTen();
        System.out.println(obj2.a);
    }
}
