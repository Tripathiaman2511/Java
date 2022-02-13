package Classes;
class PassArray{
    // ... this is call VarArgument
    public void vTest(int ...v){
        System.out.print(v.length+": ");
        for(int x : v){
            System.out.print(x+" ");
        }
        System.out.println();
    }

    //Remember: varargs parameter must be last
    //        : there should be only one varargs
    public void vTest(int a,double b,int c,int ...v){
        System.out.print(v.length+": ");
        for(int x: v){
            System.out.print(x+" ");
        }
        System.out.println();
    }
    public void vTest(int a,String ...v){
        System.out.print(v.length+": ");
        for(String x: v){
            System.out.print(x+" ");
        }
        System.out.println();
    }
}
public class Varargs {
    public static void main(String[] args) {
        PassArray obj1=new PassArray();
        obj1.vTest(12,12,12,12,11);
        obj1.vTest(1,2.0,3,11,12,31,112,10,11,12);
        obj1.vTest(1,"Hello what is this?   "+"Do it now");

    }
}
