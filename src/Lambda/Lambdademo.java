package Lambda;
interface Mynum{
    double getValue();
}
//single Parameter
interface NumericTest{
    boolean test(int n);
}
//two parameters
interface NumericTest2{
    boolean test(int n, int d);
}

public class Lambdademo {
    public static void main(String[] args) {
        Mynum mynum;
        mynum=()->12.3;
        System.out.println(mynum.getValue());

        NumericTest isEven= (n)-> (n%2)==0;
        System.out.println(isEven.test(2));

        NumericTest isNonNegative=(n)->n>=0;
        System.out.println(isNonNegative.test(5));

        NumericTest isOdd=(var n)->(n%2)!=0;
        System.out.println(isOdd.test(5));

        NumericTest2 isFactor=(n,d)->(n%d)==0;
        System.out.println(isFactor.test(10,2));
    }
}
