package Generics;

class Gen1<T>{
    T obj;
    Gen1(T ob){
        this.obj=ob;

    }
    T getObj(){
        return obj;
    }
}
public class RawDemo {
    public static void main(String[] args) {
        Gen<Integer> genWithTypeInt=new Gen<>(88);
        System.out.println(genWithTypeInt.getObj());

        Gen<String> genWithTypeStr=new Gen<>("Hello");
        System.out.println(genWithTypeStr.getObj());

        Gen withRawType=new Gen(Double.valueOf(88.7));
        System.out.println((Double)withRawType.getObj());

       // int i=(Integer) withRawType.getObj(); //run-time error
        // This assignment overrides Type Safety
       // genWithTypeStr=withRawType; //Ok,but potentially wrong
      //  String str=(String) genWithTypeStr.getObj(); //run-time error

         withRawType=genWithTypeInt; //Ok,but potentially wrong
       // double d=(Double) withRawType.getObj(); //run-time error

    }

}
