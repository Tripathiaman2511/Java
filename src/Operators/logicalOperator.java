package Operators;

public class logicalOperator {
    public static void main(String[] args) {
        int demo=0;
        // & throws exception
        // && this will just ignore if one of the operand is false
        if(demo!=0 & 5/demo>0){
            System.out.println("working");
        }

    }
}
