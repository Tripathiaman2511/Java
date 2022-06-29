package Lambda;
interface MyFunc{
    int func(int n);
}
public class VarCapture {
    public static void main(String[] args) {
        int num=10;
        MyFunc value=(n)->{
            ///cannot modify effectively final variable inside a lambda expression
            //num++

            return num+n;
        };
        //it removes effectively final of num
        //num=9;
    }
}
