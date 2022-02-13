package ExceptionHandling;

public class Finally{

    static void progA() {

        try{

            System.out.println("inside progA");
            throw new RuntimeException("demo");
        }finally{
            System.out.println("progA finally");
        }
    }
    static void progB(){
        try{
            System.out.println("inside progB");
            return;
        }finally {
            System.out.println("progB finally");
        }
    }

    static  void progC(){
        try{
            System.out.println("inside progC");
        }finally {
            System.out.println("porgC finally");
        }
    }

    public static void main(String[] args) {
       try{
           progA();
       }catch (RuntimeException e){
           System.out.println("caught "+e);
       }
        progB();
        progC();
    }
}
