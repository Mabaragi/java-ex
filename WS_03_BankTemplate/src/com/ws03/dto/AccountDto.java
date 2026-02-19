package com.ws03.dto;

/**
 *  고객의 계좌정보 관리하는 객체
 * */
public class AccountDto {
  int accountSeq;
  int accountNumber;
  int balance;
  int userSeq;
  
  public AccountDto() {}

  public AccountDto(int accountSeq, int accountNumber, int balance, int userSeq) {
	this.accountSeq = accountSeq;
	this.accountNumber = accountNumber;
	this.balance = balance;
	this.userSeq = userSeq;
  }
}
