package ex0210.book.p20;

import java.util.Scanner;

class Account {

    private final String accountNumber;
    private final String owner;
    private int balance;

    public Account(String accountNumber, String owner, int balance) {
        this.accountNumber = accountNumber;
        this.owner = owner;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getOwner() {
        return owner;
    }

    public int getBalance() {
        return balance;
    }

    public void deposit(int amount) {
        balance += amount;
    }

    public boolean withdraw(int amount) {
        if (balance < amount) {
            return false;
        }
        balance -= amount;
        return true;
    }
}

public class BankApplication {

    private static final Scanner scanner = new Scanner(System.in);
    private static Account[] accounts = new Account[10];
    private static int accountCount = 0;

    public static void main(String[] args) {
        boolean running = true;

        while (running) {
            printMenu();
            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1 -> createAccount();
                case 2 -> printAccounts();
                case 3 -> deposit();
                case 4 -> withdraw();
                case 5 -> running = false;
                default -> System.out.println("Invalid menu number.");
            }
        }

        System.out.println("Application closed.");
    }

    private static void printMenu() {
        System.out.println("------------------------------------------------");
        System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
        System.out.println("------------------------------------------------");
        System.out.print("선택> ");
    }

    private static void createAccount() {
        System.out.print("계좌번호: ");
        String number = scanner.nextLine();

        System.out.print("계좌주: ");
        String owner = scanner.nextLine();

        System.out.print("초기입금액: ");
        int balance = Integer.parseInt(scanner.nextLine());

        ensureCapacity();
        accounts[accountCount++] = new Account(number, owner, balance);
        System.out.println("결과: 계좌가 생성되었습니다.");
    }

    private static void printAccounts() {
        for (int i = 0; i < accountCount; i++) {
            Account account = accounts[i];
            System.out.printf("%s\t%s\t%d%n",
                    account.getAccountNumber(),
                    account.getOwner(),
                    account.getBalance());
        }
    }

    private static void deposit() {
        Account account = findAccount();
        if (account == null) {
            return;
        }

        System.out.print("예금액: ");
        int amount = Integer.parseInt(scanner.nextLine());

        account.deposit(amount);
        System.out.println("결과: 예금이 성공되었습니다.");
    }

    private static void withdraw() {
        Account account = findAccount();
        if (account == null) {
            return;
        }

        System.out.print("출금액: ");
        int amount = Integer.parseInt(scanner.nextLine());

        if (account.withdraw(amount)) {
            System.out.println("결과: 출금이 성공되었습니다.");
        } else {
            System.out.println("잔액이 부족합니다.");
        }
    }

    private static Account findAccount() {
        System.out.print("계좌번호: ");
        String number = scanner.nextLine();

        for (int i = 0; i < accountCount; i++) {
            Account account = accounts[i];
            if (account.getAccountNumber().equals(number)) {
                return account;
            }
        }

        System.out.println("계좌를 찾을 수 없습니다.");
        return null;
    }

    private static void ensureCapacity() {
        if (accountCount < accounts.length) {
            return;
        }

        Account[] expanded = new Account[accounts.length * 2];
        for (int i = 0; i < accounts.length; i++) {
            expanded[i] = accounts[i];
        }
        accounts = expanded;
    }
}
