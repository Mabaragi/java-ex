package ws05.service;

import java.util.ArrayList;
import java.util.List;

import ws05.dto.AccountDto;
import ws05.dto.InstallAccountDto;
import ws05.dto.LoanAccountDto;
import ws05.dto.SavingAccountDto;
import ws05.dto.UserDto;

// final은 고정값= 값변경불가 (반드시 초기화 필수)
public class BankService {



	ArrayList<UserDto> userList;
	ArrayList<AccountDto> accountList;

	/**
	 * 생성자에서 테스트를 위한 고객 및 계좌 객체를 생성하고 배열에 저장한다
	 */
	public BankService() {
		// 배열 생성
		userList = new ArrayList<UserDto>();
		accountList = new ArrayList<AccountDto>();

		// 각 배열방에 고객과 계좌를 생성한다.
		// 고객 4명
		userList.add(new UserDto(100, "장희정", "8253jang@daum.net", "010-8875-8253", false));
		userList.add(new UserDto(200, "이효리", "lee@daum.net", "010-2222-3333", false));
		userList.add(new UserDto(300, "송중기", "song@naver.com", "010-5554-2222", false));
		userList.add(new UserDto(400, "삼순이", "sam@daum.com", "010-2222-2222", false));

		// 계좌는 6개 정도 (하위 타입으로 분리)
		accountList.add(new SavingAccountDto(10, "00100101001001", 500, 100, 100));
		accountList.add(new LoanAccountDto(20, "00200202002002", 0, 200, "House"));
		accountList.add(new InstallAccountDto(30, "00300303003003", 1000, 300, 12, 10000));
		accountList.add(new SavingAccountDto(40, "00400404004004", 800, 200, 50));
		accountList.add(new LoanAccountDto(50, "00500505005005", 600, 100, "Car"));
		accountList.add(new InstallAccountDto(60, "00600606006006", 3500, 400, 24, 15000));

		System.out.println("---세팅완료!!----");

	}// 생성자 끝

	/**
	 * 모든 계좌 정보 조회
	 */
	public List<AccountDto> getAccountList() { // 100
		return accountList;
	}

	/**
	 * 	balance 기준으로 정렬
	 */
	public List<AccountDto> getAccountListSortByBalance(){
		List<AccountDto> searchlist = new ArrayList<AccountDto>();
		searchlist.sort((o1, o2)-> o1.getBalance() - o2.getBalance());
		return searchlist;
	}

	public List<AccountDto>getAccountListSortByUserSeq(){
		List<AccountDto> searchlist = new ArrayList<AccountDto>();
		searchlist.sort((o1, o2)-> o1.getUserSeq() - o2.getUserSeq());
		return searchlist;
	}
	/**
	 * 특정 사용자의 고객 정보를 리턴 하는 메소드를 작성한다
	 * 
	 * @param : 고객의 sequence
	 * @return : null이면 고객의정보없다
	 **/
	public UserDto getUserDetail(int userSeq) {
		for (UserDto user : userList) {
			if (user.getUserSeq() == userSeq) {
				return user;
			}
		}
		return null;
	}


}
