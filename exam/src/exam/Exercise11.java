package exam;

public class Exercise11 {
    public static void main(String[] args) {

        while (true) {
            int dice1 = getDiceNum();
            int dice2 = getDiceNum();
            System.out.println("(" + dice1 + ", " + dice2 + ")");
            if (dice1 + dice2 == 5) {
                break;
            }
        }

    }

    public static int getDiceNum() {
        return (int) (Math.random() * 6) + 1;
    }
}
