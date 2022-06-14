package Enumeration;
enum Family{
    Aman,Arun,Rashmi,Tripathi
}
public class EnumDemonstration {
    public static void main(String[] args) {
        Family fp;
        fp=Family.Arun;
        System.out.println("Father: "+fp);

        fp=Family.Aman;
        System.out.println("Son: "+fp);

        fp=Family.Rashmi;
        System.out.println("Mother: "+fp);

        fp=Family.Tripathi;
        System.out.println("Surname: "+fp);

        //values() ad valueOF(String arg)
        Family f[]=Family.values();
        for(Family x: f){
            System.out.println(x);
        }
        fp=Family.valueOf("Aman");
        System.out.println(fp);

    }
}
