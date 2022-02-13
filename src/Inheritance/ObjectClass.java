package Inheritance;

public class ObjectClass {
    public static void main(String[] args) {
    /*Object obj=new String("Hello");
    boolean my=obj.equals(obj);
        System.out.println(my);*/

        ObjectClass s=new ObjectClass();
        System.out.println(s.hashCode());
        s=null;
        System.gc();
        //System.out.println("end");
    }
    @Override protected void finalize() {
        System.out.println("Finalize method called");
    }
}
