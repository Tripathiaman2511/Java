package Classes;

class MethodExample{
    //instance variable
    double width;
    double breadth;
    double height;

    //methods
    double volume(){
        return width*breadth*height;
    }
    // parameterized methods
    void setDim(double w,double b, double h){
        width=w;
        breadth=b;
        height=h;
    }
}
public class Methods {
    public static void main(String[] args) {
        MethodExample exp1=new MethodExample();
        exp1.setDim(12,13,16.2);
        double vol=exp1.volume();
        System.out.println(vol);
    }
}
