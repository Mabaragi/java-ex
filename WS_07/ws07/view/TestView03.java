package ws07.view;

import java.util.List;

import ws07.exception.BalanceLackException;
import ws07.exception.UserAccountNotFoundException;
import ws07.dto.AccountDto;
import ws07.service.BankService;
import ws07.service.BankServiceImpl;

public class TestView03 {
	public static void main(String[] args) {

		BankService bankService = new BankServiceImpl();

		try {
			System.out.println(bankService.getUserAccount(111, 90));
		} catch (UserAccountNotFoundException e) {
			System.out.println(e.getMessage());
		}

		try {
			bankService.withdraw(100, 10, 10000);
		} catch (BalanceLackException | UserAccountNotFoundException e) {
			System.out.println(e.getMessage());
		}
	}

	public static void print(List<AccountDto> accountList) {
		for (AccountDto accountDto : accountList) {
			System.out.println(accountDto);
		}
		System.out.println();
	}

}
