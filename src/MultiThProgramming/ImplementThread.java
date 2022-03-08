package MultiThProgramming;

class NewThread implements Runnable{
    Thread t;
    NewThread(){
        t=new Thread(this,"Demo");
        System.out.println("Child Thread: "+t);
    }
    public void run(){
        try{
            for(int n=5;n>0;n--){
                System.out.println("Child Thread: "+n);
                Thread.sleep(500);

            }
        }catch(InterruptedException e){
            System.out.println("Child Thread Interrupted");
        }
        System.out.println("Exiting the child thread");
    }
}
public class ImplementThread {
    public static void main(String[] args) {
        NewThread nt=new NewThread();
        nt.t.start();
        try{
            for(int n=5;n>0;n--){
                System.out.println("Main Thread: "+n);
                Thread.sleep(1000);
            }
        }catch(InterruptedException e) {
            System.out.println("Main Thread Interrupted");
        }
        System.out.println("Exiting the Main Thread");

    }
}
