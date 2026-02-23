package mvc.view;

import java.util.Scanner;

import mvc.controller.ProfileController;
import mvc.dto.Profile;

/**
   사용자의 요청을 키보드로 입력받는 클래스 
*/
public class MenuView{
    Scanner sc= new Scanner(System.in);
	ProfileController controller = new ProfileController(); // 전역변수 초기화, 생성자 호출 

	/**
	  전체 메뉴를 출력하는 메소드
	*/
	public void printMenu(){
        
		 while(true){
	           System.out.println("----------------------------------------------------------------------------------");
	           System.out.println("1. 프로필 저장    2. 프로필 불러오기     3. 종료");
			   System.out.println("----------------------------------------------------------------------------------");
			   System.out.print("메뉴선택 > ");

			   String  menu = sc.nextLine();
			   switch(menu){
	               case "1" : 
	                 this.insert();
				   break;
				   case "2" : 
	                 this.inputSearch();
				   break;
				   case "3" : 
				   	 this.exit();
	                 System.exit(0);
				   default:
					   System.out.println("메뉴를 다시 선택해주세요!!!!");

			   }//switch문끝

			 }//while문끝
	}//메소드끝


    public void inputSearch(){
       System.out.print("이름> ");
        String inputString = sc.nextLine();
		controller.searchByName(inputString);

   
	}



	public void insert(){
        System.out.print("이름> ");
        String name = sc.nextLine();
        System.out.print("몸무게> ");
        int weight = Integer.parseInt(sc.nextLine());
        System.out.print("비밀번호> ");
        String password = sc.nextLine();

		Profile profile = new Profile(name, weight, password);        
		controller.insert(profile);

	}	


  public void exit(){
	  controller.exit();
  }
}
