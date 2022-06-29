package Lambda.MethodReferences;
//use an instance method reference with different objects
interface  MyFunc<T>{
    boolean func(T v1,T v2);
}

class HighTemp{
    private int hTemp;
    HighTemp(int hTemp){
        this.hTemp=hTemp;

    }
    boolean sameTemp(HighTemp ht2){
        return hTemp==ht2.hTemp;
    }
    boolean lessTemp(HighTemp ht2){
        return hTemp<ht2.hTemp;
    }
}
public class MRtoInstanceMethod2 {
    static <T> int counters(T[] vals,MyFunc<T> f,T v){
        int count=0;
        for(T val:vals){
            if (f.func(val,v)) count++;

        }
        return count;
    }

    public static void main(String[] args) {
        int count;
        HighTemp[] weekDayHighs={new HighTemp(89),new HighTemp(82),new HighTemp(90),new HighTemp(89),new HighTemp(89),new HighTemp(91),new HighTemp(84),new HighTemp(83)};
        //ClassName::InstanceMethod
        count=counters(weekDayHighs,HighTemp::sameTemp,new HighTemp(89));
        System.out.println(count+" day(s) had a high of 89");

        count=counters(weekDayHighs,HighTemp::lessTemp,new HighTemp(89));
        System.out.println(count+" day(s) had a high of less than 89");


    }
}
