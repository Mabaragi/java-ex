package ws07.view;

import java.util.List;

import ws07.dto.AccountDto;
import ws07.service.BankService;
import ws07.service.BankServiceImpl;

public class TestView02 {
	public static void main(String[] args) {
		BankService bankService = new BankServiceImpl();
		System.out.println("1. 전체 계좌 정보 조회 ------");
		print(bankService.getAccountList());

		System.out.println("2. 잔액 기준 정렬 -------------");
		print(bankService.getAccountListSortByBalance());

		System.out.println("3. UserSeq 기준 정렬 -------------");
		print(bankService.getAccountListSortByUserSeq());

		System.out.println("4. 전체 계좌 정보 조회 ------");
		print(bankService.getAccountList());
	}

	public static void print(List<AccountDto> accountList) {
		for (AccountDto accountDto : accountList) {
			System.out.println(accountDto);
		}
		System.out.println();
	}
}


