package ex0210.book;

public class Ex17 {
    public static void main(String[] args) {        
        Printer2.println(10);
        Printer2.println(true);
        Printer2.println(5.7);
        Printer2.println("홍길동");
    }
}

class Printer2{
    public static void println(int value) {
        System.out.println(value);
    }

    public static void println(boolean value) {
        System.out.println(value);
    }

    public static void println(double value) {
        System.out.println(value);
    }

    public static void println(String value) {
        System.out.println(value);
    }

}