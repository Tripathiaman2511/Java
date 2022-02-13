package Classes;
class Box{
    double width;
    double height;
    double breadth;

    //Object as a parameter
    Box(Box obj){
        width=obj.width;
        height=obj.height;
        breadth=obj.breadth;
    }
    Box(double width,double breadth, double height){
        this.width=width;
        this.breadth=breadth;
        this.height=height;
    }
    Box(){
        width=height=breadth=-1;
    }
    Box(double value){
        width=breadth=height=value;
    }
    double Volume(){
        return width*breadth*height;
    }
}
public class ObjectAsParameters {
    public static void main(String[] args) {
        Box sample=new Box(12,13,14);
        Box clone=new Box(sample);
        System.out.println(sample.Volume());
        System.out.println(clone.Volume());
    }
}
