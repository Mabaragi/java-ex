package exam;

public class Exercise03 {
    public static void main(String[] args) {
        String myName = "고영진";
        int korean, english, math;
        int totalScore;
        double averageScore;
        char grade;

        korean = getRandomScore();
        english = getRandomScore();
        math = getRandomScore();

        totalScore = korean + english + math;
        averageScore = totalScore / 3.0;

        if (averageScore >= 90) {
            grade = 'A';
        } else if (averageScore >= 80) {
            grade = 'B';
        } else if (averageScore >= 70) {
            grade = 'C';
        } else if (averageScore >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }

        System.out.println(String.format("이름: %s, 국어점수: %d, 영어점수: %d, 수학점수: %d, 총점: %d, 평균: %.2f, 학점: %c", myName, korean, english, math, totalScore, averageScore, grade));        

        grade = switch ((int) (averageScore / 10)) {
            case 9, 10 -> 'A';
            case 8 -> 'B';
            case 7 -> 'C';
            case 6 -> 'D';
            default -> 'F';
        };
        System.out.printf("이름: %s, 국어점수: %d, 영어점수: %d, 수학점수: %d, 총점: %d, 평균: %.2f, 학점: %c", myName, korean, english,
                math, totalScore, averageScore, grade);       
        
    }

    public static int getRandomScore() {
        return (int) (Math.random() * 56) + 45;
    }
}
