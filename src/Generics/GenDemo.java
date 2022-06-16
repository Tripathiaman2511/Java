package Generics;
class Gen<T>{
    //object of type T
    T obj;

    //pass the constructor a reference to an object of type T
    Gen(T obj){
        this.obj=obj;
    }

    //return object
    T getObj(){
        return obj;
    }

    //Show type of T
    void showType(){
        System.out.println("Type of T is: "+obj.getClass().getName());
    }

}

public class GenDemo {
    public static void main(String[] args) {

        //Create a gen reference for Integers
        Gen<Integer> refObj;

        //assign value to refObj
        refObj=new Gen<Integer>(88);

        //show type of data used by refObj
        refObj.showType();

        //get refObj value
        int v=refObj.getObj();
        System.out.println("Value: "+v);

        System.out.println();

        //Create a gen reference for String
        Gen<String> refObjString;

        //assign value to refObjString
        refObjString=new Gen<String>("hello");

        //show type of data used by refObjString
        refObjString.showType();

        //get refObjString value
        String u=refObjString.getObj();
        System.out.println("Value: "+u);

    }
}
