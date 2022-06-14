package InputOutput;

import java.io.PrintWriter;

public class PrintWriterDemo {
    public static void main(String[] args) {
        PrintWriter pw=new PrintWriter(System.out,true);
        pw.println("This is a text");

    }
}
