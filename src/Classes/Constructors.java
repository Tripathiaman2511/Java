package Classes;

class ConstructorExample{
    // intstance variable
    double width;
    double height;
    double breadth;
    //using this keyword can remove instance variable hiding because of constructors parameter
    //it is used to resolve namespace collision that might happen between instance variable and local variables
    ConstructorExample(double width,double breadth, double height){
        this.width=width;
        this.breadth=breadth;
        this.height=height;
    }
    double Volume(){
        return width*breadth*height;
    }
}
public class Constructors {
    public static void main(String[] args) {
        ConstructorExample exp1=new ConstructorExample(12,31,14);
        System.out.println(exp1.Volume());
    }
}
