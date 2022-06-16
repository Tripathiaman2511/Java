package Generics;
//Specifying Number as an upper bound
class Stats<T extends Number>{
    T[] nums;

    Stats(T[] obj){
        this.nums=obj;
    }

    //Return type double in all cases.
    double average(){
        double sums=0.0;
        for (T num : nums) {
            sums += num.doubleValue();

        }
        return sums/nums.length;
    }

    //using Wildcard
    boolean getAverage(Stats<?> ob){
        return average() == ob.average();
    }

}
public class BoundDemo {
    public static void main(String[] args) {
        Integer[] iNums ={1,2,3,4,5,6};
        Stats<Integer> iObj=new Stats<>(iNums);
        double v=iObj.average();
        System.out.println("iob average is: "+v);

        Double[] dNums ={1.1,2.2,3.3,4.4,5.5,6.6};
        Stats<Double> dObj=new Stats<>(dNums);
        double u=dObj.average();
        System.out.println("dObj average is: "+u);

        System.out.println(dObj.getAverage(iObj));

    }
}
