package Generics;
//Demonstrating a simple gen method
 public class GenMethDemo {
     static <T extends Comparable<T>,V extends T> boolean isIn(T x,V[] y){
        for (V v : y) {
            if(x.equals(v)) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Integer[] nums={1,2,3,4,5};
        if(isIn(3,nums)) System.out.println("2 is in nums");

        if(!isIn(7,nums)) System.out.println("7 is not in nums");

        //for strings
        String[] str={"Aman","Arun","Rashmi","Tripathi"};
        if(isIn("Aman",str)) System.out.println("Aman is in str");
        if(!isIn("Shreya",str)) System.out.println("Shreya is not in str");
        // if(isIn(7,str) Error

    }
}
