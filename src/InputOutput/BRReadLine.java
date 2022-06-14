package InputOutput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//use a buffer reader to read strings from the console
public class BRReadLine {
    public static void main(String[] args) throws IOException {
        String str;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter 'stop' to quit");
        do{
            str=br.readLine();
            System.out.println(str);
        }while (!str.equals("stop"));

    }
}
