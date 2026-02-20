package ws07.service;

import java.util.ArrayList;
import java.util.List;

import ws07.dto.AccountDto;
import ws07.dto.InstallAccountDto;
import ws07.dto.LoanAccountDto;
import ws07.dto.SavingAccountDto;
import ws07.dto.UserDto;
import ws07.exception.BalanceLackException;
import ws07.exception.UserAccountNotFoundException;

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

	@Override
	public AccountDto getUserAccount(int userSeq, int accountSeq) throws UserAccountNotFoundException {
		for (AccountDto account : accountList) {
			if (account.getUserSeq() == userSeq && account.getAccountSeq() == accountSeq) {
				return account;
			}
		}
		throw new UserAccountNotFoundException("사용자 또는 계좌를 찾를 수 없습니다.");
	}

	@Override
	public int withdraw(int userSeq, int accountSeq, int amount) throws UserAccountNotFoundException, BalanceLackException {
		AccountDto accountDto = getUserAccount(userSeq, accountSeq);

		if (accountDto.getBalance() < amount) {
			throw new BalanceLackException("잔액이 부족합니다.");
		}

		accountDto.setBalance(accountDto.getBalance() - amount);
		return amount;
	}
}



