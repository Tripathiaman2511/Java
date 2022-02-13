package ExceptionHandling;

public class Throw {
    static void demodoc(){
        try{
            throw new NullPointerException("word");

        }catch (NullPointerException e){
            System.out.println("caught inside the catch"+ e.getMessage());

            throw e;

        }
    }
    public static void main(String[] args) {
        try{
            demodoc();
        }catch (NullPointerException e){
            System.out.println("Re-caught"+e);
        }

    }
}
