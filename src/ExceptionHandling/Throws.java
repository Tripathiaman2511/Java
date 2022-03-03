package ExceptionHandling;

public class Throws {
    static void throwOne() throws IllegalAccessException{
        System.out.println("Inside throwOne");

        throw new IllegalAccessException("demo");
    }

    public static void main(String[] args) {
        try{
            throwOne();
        }catch (IllegalAccessException e){
            System.out.println("caught "+ e);
            System.out.println("getMessage()="+e);
            e.printStackTrace();
        }
    }
}
