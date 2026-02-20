package ws06.service;

import java.util.ArrayList;
import java.util.List;

import ws06.dto.AccountDto;
import ws06.dto.InstallAccountDto;
import ws06.dto.LoanAccountDto;
import ws06.dto.SavingAccountDto;
import ws06.dto.UserDto;

public class BankServiceImpl implements BankService {
	private ArrayList<UserDto> userList;
	private ArrayList<AccountDto> accountList;

	public BankServiceImpl() {
		userList = new ArrayList<>();
		accountList = new ArrayList<>();

		userList.add(new UserDto(100, "User-1", "8253jang@daum.net", "010-8875-8253", false));
		userList.add(new UserDto(200, "User-2", "lee@daum.net", "010-2222-3333", false));
		userList.add(new UserDto(300, "User-3", "song@naver.com", "010-5554-2222", false));
		userList.add(new UserDto(400, "User-4", "sam@daum.com", "010-2222-2222", false));

		accountList.add(new SavingAccountDto(10, "00100101001001", 500, 100, 100));
		accountList.add(new LoanAccountDto(20, "00200202002002", 0, 200, "House"));
		accountList.add(new InstallAccountDto(30, "00300303003003", 1000, 300, 12, 10000));
		accountList.add(new SavingAccountDto(40, "00400404004004", 800, 200, 50));
		accountList.add(new LoanAccountDto(50, "00500505005005", 600, 100, "Car"));
		accountList.add(new InstallAccountDto(60, "00600606006006", 3500, 400, 24, 15000));
	}

	@Override
	public List<AccountDto> getAccountList() {
		return accountList;
	}

	@Override
	public List<AccountDto> getAccountListSortByBalance() {
		List<AccountDto> searchlist = new ArrayList<>(accountList);
		searchlist.sort((o1, o2) -> o1.getBalance() - o2.getBalance());
		return searchlist;
	}

	@Override
	public List<AccountDto> getAccountListSortByUserSeq() {
		List<AccountDto> searchlist = new ArrayList<>(accountList);
		searchlist.sort((o1, o2) -> o1.getUserSeq() - o2.getUserSeq());
		return searchlist;
	}

	@Override
	public UserDto getUserDetail(int userSeq) {
		for (UserDto user : userList) {
			if (user.getUserSeq() == userSeq) {
				return user;
			}
		}
		return null;
	}
}
