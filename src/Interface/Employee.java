package Interface;


class Work implements InterfaceCall {
    public void callBack(int param){
        System.out.println("Hello World..");
    }
}

class Employee {
    public static void main(String[] args) {
        Work we =new Work();
        we.callBack(12);

    }
}