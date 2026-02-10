package ex0210.book;


public class Ex19 {
    public static void main(String[] args) {
        Account account = new Account();
        account.setBalance(10000);
        System.out.println("현재 잔고: " + account.getBalance());

        account.setBalance(-100);
        System.out.println("현재 잔고: " + account.getBalance());

        account.setBalance(2_000_000);
        System.out.println("현재 잔고: " + account.getBalance());

        account.setBalance(300_000);
        System.out.println("현재 잔고: " + account.getBalance());

        
    }
}

class Account{
    private int balance;
    
    public void setBalance(int balance){
        if (balance >= 0 && balance <= 1_000_000) {
            this.balance = balance;
        }
    }
    public int getBalance(){
        return this.balance;
    }

}