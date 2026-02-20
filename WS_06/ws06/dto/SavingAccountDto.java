package ws06.dto;

public class SavingAccountDto extends AccountDto {
	private int transferFee;

	public SavingAccountDto() {
	}

	public SavingAccountDto(int accountSeq, String accountNumber, int balance, int userSeq, int transferFee) {
		super(accountSeq, accountNumber, balance, userSeq);
		this.transferFee = transferFee;
	}

	public int getTransferFee() {
		return transferFee;
	}

	public void setTransferFee(int transferFee) {
		this.transferFee = transferFee;
	}

	@Override
	public String toString() {
		return "SavingAccountDto [accountSeq=" + getAccountSeq() + ", accountNumber=" + getAccountNumber() + ", balance="
				+ getBalance() + ", userSeq=" + getUserSeq() + ", transferFee=" + transferFee + "]";
	}
}
