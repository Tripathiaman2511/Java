package InputOutput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//use a buffer reader to read a character from the console
//dont forget to add throws exception
public class BRRead {
    public static void main(String[] args) throws IOException {
        char c;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the character q to quit");

        //read characters
        do{
            c= (char) br.read();
            System.out.println(c);

        }while(c!='q');
    }
}
