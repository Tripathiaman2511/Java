package Generics;
//A generic interface example
interface MinMax<T extends Comparable<T>>{
    T min();
    T max();
}
class MyClass<T extends Comparable<T>> implements MinMax<T>{
    T[] vals;
    MyClass(T[] ob){vals=ob;}

    //Return min value
    public T min(){
        T min=vals[0];
        for(T s:vals) if(s.compareTo(min)<0) min=s;

        return min;
    }
    //Return max value
    public T max(){
        T max=vals[0];
        for(T s:vals) if(s.compareTo(max)>0) max=s;
        return max;
    }
}

public class GenIFDemo {
    public static void main(String[] args) {
        Integer []iNums={1,2,3,4,5};
        Character [] chr={'b','a','c','d'};

        MyClass<Integer> test1=new MyClass<>(iNums);
        System.out.println(test1.max());
        System.out.println(test1.min());

        MyClass<Character> test2=new MyClass<>(chr);
        System.out.println(test2.max());
        System.out.println(test2.min());
    }
}
