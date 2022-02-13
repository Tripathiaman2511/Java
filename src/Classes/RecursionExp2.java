package Classes;
class Recursiontest{
    int [] value;
    Recursiontest(int i){
        value=new int[i];
    }
    void printArray(int i){
        if( i==0) return;
        else printArray(i-1);
        System.out.println( (i-1)+ " "+ value[i-1] );
    }
}

public class RecursionExp2 {
    public static void main(String[] args) {
        Recursiontest exp1=new Recursiontest(10);
        int i;
        for(i=0;i<10;i++) exp1.value[i]=i;
        //view value from array
        for(int num: exp1.value) System.out.println(num);
        exp1.printArray(10);

    }
}
