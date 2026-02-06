package exam0204.method;

import java.util.Scanner;

public class GradeCalculator {
	public static void main(String[] args) {
		GradeMethod method = new GradeMethod();
		Scanner sc = new Scanner(System.in);
		while (true) {		
			String command = getInputText("1. 성적표구하기     2. 종료", sc); 			
			if (command.equals("2")) {
				System.out.println("프로그램을 종료합니다.");
				System.exit(0);
			} else if (!command.equals("1")) {
				System.out.println("잘못된 입력입니다. 다시 입력해주세요.");
				continue;
			}
			
			String inputName = getInputText("이름을 입력해 주세요.", sc);
			int inputKoreanScore = Integer.parseInt(getInputText("국어 성적을 입력해 주세요.", sc));
			int inputEnglishScore = Integer.parseInt(getInputText("영어 성적을 입력해 주세요.", sc));
			int inputMathScore = Integer.parseInt(getInputText("수학 성적을 입력해 주세요.", sc));
			
			method.printGrade(inputName, inputKoreanScore, inputEnglishScore, inputMathScore);			
		}
		
	}
	
	private static String getInputText(String guideText, Scanner sc) {
		System.out.println(guideText);
		System.out.print("입력>");
		String inputText = sc.nextLine();
		System.out.println();
		return inputText;
	}
}

class GradeMethod{
	public void printGrade(String name, int koreanScore, int englishScore, int mathScore) {
		int subjectNum = 3;
		int totalScore = getTotalScore(koreanScore, englishScore, mathScore);
		double meanScore = getMeanScore(totalScore, subjectNum);
		char grade = getGrade(meanScore);
		String resultMessage = String.format("%s님의 총점은 %d, 평균은 %.2f, 성적은 %c 입니다.", name, totalScore, meanScore, grade);
		System.out.println(resultMessage);
	}
	
	private int getTotalScore(int koreanScore, int englishScore, int mathScore) {
		return koreanScore + englishScore + mathScore;
	}
	
	private double getMeanScore(int toTalScore, int subjectNum) {
		return toTalScore/(double)subjectNum;
	}
	
	private char getGrade(double meanScore) {
		if (90 <= meanScore) return 'A';
		if (80 <= meanScore) return 'B';
		if (70 <= meanScore) return 'C';
		if (60 <= meanScore) return 'D';
		return 'F';
	}
}