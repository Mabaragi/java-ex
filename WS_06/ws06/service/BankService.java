package ws06.service;

import java.util.List;

import ws06.dto.AccountDto;
import ws06.dto.UserDto;

public interface BankService {
	List<AccountDto> getAccountList();

	List<AccountDto> getAccountListSortByBalance();

	List<AccountDto> getAccountListSortByUserSeq();

	UserDto getUserDetail(int userSeq);
}
