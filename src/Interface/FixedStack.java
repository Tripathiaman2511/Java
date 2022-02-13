package Interface;
class IFTest implements IntStack{
    private int stack[];
    private int tos;

    IFTest(int size){
        stack=new int[size];
        tos=-1;
    }
    public void push(int value){
        if(tos==stack.length-1){
            System.out.println("Stack is Full...");
        }
        else{
            stack[++tos]=value;
        }
    }
    public int pop(){
        if(tos<0) {
            System.out.println("Stack is Empty");
            return 0;
        }
            else
                return stack[tos--];

    }

}
public class FixedStack {
    public static void main(String[] args) {
        int size=2;
        IFTest obj=new IFTest(size);

        for(int i =0;i<size;i++){
            obj.push(i);
        }
        for( int x =0;x<size;x++){
            System.out.println(obj.pop());
        }
    }
}
