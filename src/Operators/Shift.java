package Operators;

public class Shift {
    public static void main(String[] args) {

        //Last shift can be obtained till 30 for int after 30 bit is lost and for long 62 after 62 bit is lost
        /*int a=2;
        System.out.println(a<<30);
        System.out.println(a<<31);*/
        //this print 0

        //byte nad char gets converted into int after the left shift
       /* byte c=64;
        int d=c<<2;*/
        //System.out.println(((Object)d).getClass().getSimpleName());
     /*   System.out.println((byte)(c<<2));
        int value=9;
        System.out.println(value>>1);
        */

        //Sift right example
      /* int x=64;
       while(x>0){
            x>>=1;
           System.out.println(x);

       }*/
       /*int num1=-8;
        System.out.println(num1>>1);
    int num2=-1;
        System.out.println(num2>>1);*/

       /* char hex[]={
          '0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'
        };
        byte b=(byte) 0xf1;
        System.out.println(b>>4);
        System.out.println("b=0x"+hex[(b>>4)& 0x0f]+hex[b & 0x0f]);*/
        //0f=00001111
        //f1=11110001

        //hex[(b>>4) &0x0f]
        //(b>>4)=> -1 => 11111111
        //0x-0f=> 15 => 00001111
        //AND value is 1111

        //unsigned right shift (>>>)
        /*int num=-1;
        System.out.println(num>>24);*/


        char hex[]={
                '0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'
        };
        byte b= (byte) 0xf1;
        byte c = (byte) (b>>4);
        byte d = (byte) (b>>>4);
        byte e = (byte) ((b & 0xff) >> 4);
        System.out.println("0x"+hex[(b>>4) & 0x0f] + hex[b & 0x0f]);
        System.out.println("0x"+hex[(c>>4) & 0x0f] + hex[c & 0x0f]);
        System.out.println("0x"+hex[(d>>4) & 0x0f] + hex[d & 0x0f]);
        System.out.println("0x"+hex[(e>>4) & 0x0f] + hex[e & 0x0f]);
    }
}
