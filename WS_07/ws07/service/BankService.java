package ws07.service;

import java.util.List;

import ws07.dto.AccountDto;
import ws07.dto.UserDto;
import ws07.exception.BalanceLackException;
import ws07.exception.UserAccountNotFoundException;

public interface BankService {
	List<AccountDto> getAccountList();

	List<AccountDto> getAccountListSortByBalance();

	List<AccountDto> getAccountListSortByUserSeq();

	UserDto getUserDetail(int userSeq);

	AccountDto getUserAccount(int userSeq, int accountSeq) throws UserAccountNotFoundException;

	int withdraw(int userSeq, int accountSeq, int amount) throws UserAccountNotFoundException, BalanceLackException;
}


