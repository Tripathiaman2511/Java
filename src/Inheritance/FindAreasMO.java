package Inheritance;
//Method Overriding
class Figure{
    double dim1;
    double dim2;

    Figure(double a, double b){
        dim1=a;
        dim2=b;
    }
    double area(){
        System.out.println("Area of figure is undefined");
        return 0;
    }
}
class Rectangle extends Figure{
    Rectangle(double a, double b){
        super(a,b);
    }
    double area(){
        System.out.println("Inside Area of Rectangle");
        return dim1*dim2;
    }
}

class Triangle extends Figure{
    Triangle(double a,double b){
        super(a,b);
    }
    double area(){
        System.out.println("Inside Area of Triangle");
        return dim1*dim2;
    }
}

public class FindAreasMO {
    public static void main(String[] args) {
        Figure f=new Figure(10,10);
        Rectangle r= new Rectangle(1,1);
        Triangle t=new Triangle(2,2);
        Figure figr;
        figr=r;
        System.out.println(figr.area());

        figr=t;
        System.out.println(figr.area());
        figr =f;
        System.out.println(figr.area());
    }
}
