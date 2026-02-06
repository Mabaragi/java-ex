package exam0204.method;

public class Exercise14 {
    public static void main(String[] args) {

        for (int i = 0; i < 6; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("★");
            }
            System.out.println();
        }
        System.out.println("***********************");
        for (int i = 0; i < 6; i++) {
            for (int j = 1; j < 6 - i; j++) {
                System.out.print("★");
            }
            System.out.println();
        }
        System.out.println("***********************");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 4 - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("★");
            }
            System.out.println();
        }
        System.out.println("***********************");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 5 - i; j++) {
                System.out.print("★");
            }
            System.out.println();
        }
    }
}
