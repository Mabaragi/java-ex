package mvc.view;


import mvc.dto.Profile;

/**
 * 사용자 요청에 해당하는 결과를 모니터에 출력하는 클래스 
 */

public class SuccessView {


    public static void printSearchByName(Profile profile) {
        System.out.println(profile +"\n");
    }

    /**
     * 성공에 관련된 메세지 출력 
     * @param message
     */
    public static void printMessage(String message) {
         System.out.println(message+"\n");
    }

    
}
