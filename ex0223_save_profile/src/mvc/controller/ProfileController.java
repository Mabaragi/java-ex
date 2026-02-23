package mvc.controller;


import mvc.dto.Profile;
import mvc.service.ProfileService;
import mvc.service.ProfileServiceImpl;
import mvc.view.FailView;
import mvc.view.SuccessView;



/**
 * View와 Model 사이에서 중간 역할 
 *  : 사용자의 요청을 받아서 그에 해당하는 서비스를 호출하고
 *    호출한 결과를 받아서 결과값에 따라 결과 뷰를 호출해준다.
 */

public class ProfileController {
	 private ProfileService service = ProfileServiceImpl.getInstance();

	 /**
     * 프로필 저장
     */
   
    public void insert(Profile profile) {
    	try {
			System.out.println(profile + "를 삽입합니다.");
    		service.insert(profile);
    		SuccessView.printMessage("성공적으로 저장되었습니다.");
		} catch (Exception e) {
			FailView.errorMessage(e.getMessage());
		}
	}    

    /**
	 * 이름에 해당하는 프로필 불러오기
	 * @param inputString
	 */
    public void searchByName(String inputString) {
    	try {    		
    		SuccessView.printSearchByName(service.searchByName(inputString));
		} catch (Exception e) {
			FailView.errorMessage(e.getMessage());
		}
    } 

	public void exit() {
		System.out.println("프로그램을 종료합니다.");
	}

}
