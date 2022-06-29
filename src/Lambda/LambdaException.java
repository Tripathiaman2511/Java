package Lambda;


interface DoubleNumericArrayFunc{
    double func(double[] n) throws EmptyArrayException;
}
class EmptyArrayException extends Exception{
    EmptyArrayException(){
        super("Array Empty");
    }
}
public class LambdaException {
    public static void main(String[] args) throws EmptyArrayException {
        double []value={1.2,1.3,1.4,1.5};

        DoubleNumericArrayFunc average=(val)->{
            double sum=0;
            if(val.length==0)
                throw new EmptyArrayException();
            for (double v : val) {
                sum += v;
            }
            return sum/val.length;
        };

        System.out.println(average.func(value));
        System.out.println(average.func(new double[0]));
    }
}
