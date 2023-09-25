package BT1;

public class Main {
    public static void main(String[] args) {
        MyClass myClass = new MyClass("test");
        System.out.println(myClass.getMyString());
        myClass.setMyString("kk");
        System.out.println(myClass.getMyString());
    }
}
