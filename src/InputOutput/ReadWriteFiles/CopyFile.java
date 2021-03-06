package InputOutput.ReadWriteFiles;

import java.io.*;


public class CopyFile {
    public static void main(String[] args) {
        int i;
        FileInputStream fin=null;
        FileOutputStream fout=null;
        if(args.length!=2){
            System.out.println("Usage: Copy file from to");
            return;
        }
        //copy a file
        try{
            fin=new FileInputStream(args[0]);
            fout=new FileOutputStream(args[1]);

            do{
                i=fin.read();
                if(i!=-1) fout.write(i);
            }while (i!=-1);

        }catch(IOException e){
            System.out.println("Io Error: "+e);

        }finally {
            try{
                if(fin!=null) fin.close();
            }catch (IOException e){
                System.out.println("Error in closing fin: "+e);
            }

            try{
                if(fout!=null) fout.close();
            }catch(IOException e){
                System.out.println("Error in closing fout: "+e);
            }
        }
    }
}
