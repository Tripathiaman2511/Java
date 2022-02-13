package Classes;

class Stack{
    int[] arr=new int[10];
    int tos;

    Stack(){
        tos=-1;
    }

    void push(int item){
        if(tos==9)
            System.out.println("Stack is full");
        else
            arr[++tos]=item;
    }

    int pop(){
        if(tos<0) {
            return -1;
        }else{
            return arr[tos--];
    }
    }

}
public class StackClass {
    public static void main(String[] args) {
        Stack exp1=new Stack();
        for(int i=0;i<10;i++){
            exp1.push(i);
        }
        for(int i=0;i<10;i++){
            System.out.println(exp1.pop());
        }
    }
}
