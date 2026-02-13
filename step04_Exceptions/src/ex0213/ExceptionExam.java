package ex0213;

public class ExceptionExam {
    public static void main(String[] args) {
    	ExceptionExamTest.test(new String []{"fdasfdsa"});
    	ExceptionExamTest.test(new String []{"0"});
    	ExceptionExamTest.test(new String []{"1"});
        
    }
}

class ExceptionExamTest {
    public static void test(String[] args) {
        try {
            System.out.println("args length = " + args.length);
            int convertNo = Integer.parseInt(args[0]);
            int result = 10 / convertNo;

            System.out.println("args[0] = " + convertNo);
            System.out.println("result = " + result);
            
            
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("입력값이 필요합니다. 실행 예시: java ExceptionExam 5");
        } catch (NumberFormatException e) {
            System.out.println("숫자로 변환할 수 없습니다. args[0]은 정수여야 합니다. => " + e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("0으로는 나눌 수 없습니다.");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("예상치 못한 예외가 발생했습니다.");
        } finally {
        	System.out.println("finally 예외 발생 여부와 상관없이 항상 성립합니다.");
        	System.out.println("--------------------------------");
        }
        
    }
}