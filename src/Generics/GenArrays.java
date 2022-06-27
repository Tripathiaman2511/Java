package Generics;
class GenA<T extends Number>{
    T ob;
    T[] vals;
    GenA(T ob,T[] nums){
        this.ob=ob;
        //this.vals=new T[10]; // illegal
        this.vals=nums; //valid

    }
}
public class GenArrays {
    public static void main(String[] args) {
        Integer n[]={1,2,3,4,5,6};
        GenA<Integer> iob=new GenA<>(50,n);

        //GenA<Integer>[] genarray=new GenA<Integer>[10]; // illegal

        GenA<?>[] genNewArray=new GenA<?>[10]; //valid
    }
}
