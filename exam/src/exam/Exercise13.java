package exam;

import java.util.Scanner;

public class Exercise13 {
    public static void main(String[] args) {
        boolean run = true;

        int balance = 0;

        Scanner scanner = new Scanner(System.in);

        while (run) {
            // System.out.println("할 작업을 입력하세요.");
            System.out.println("1. 예금 | 2. 출금 | 3. 잔고 | 4. 종료");
            System.out.println("-----------------------------------");
            System.out.print("선택> ");

            String cmd = scanner.nextLine();

            switch (cmd) {
                case "1" -> {
                    System.out.print("예금액> ");
                    int amount = Integer.parseInt(scanner.nextLine());
                    balance += amount;
                    // System.out.println(amount + "원이 입금되었습니다.");
                }
                case "2" -> {
                    System.out.print("출금액>");
                    int amount = Integer.parseInt(scanner.nextLine());
                    balance -= amount;
                    System.out.println(amount + "원이 출금되었습니다.");
                }
                case "3" -> {
                    System.out.print("잔고>");
                    System.out.println(balance);
                }
                case "4" -> {
                    System.out.println("프로그램 종료");
                    run = false;
                }
            }
            System.out.println();
        }

    }
}
