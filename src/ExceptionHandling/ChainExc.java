package ExceptionHandling;

public class ChainExc {
    static void demoproc(){
        NullPointerException e=new NullPointerException("top loayer");
        e.initCause(new ArithmeticException("cause"));
        throw e;
    }
    public static void main(String[] args) {
        try{
            demoproc();
        }catch(NullPointerException e){
            System.out.println("caught "+e);
            System.out.println("cause exception "+e.getCause());
        }
    }
}
