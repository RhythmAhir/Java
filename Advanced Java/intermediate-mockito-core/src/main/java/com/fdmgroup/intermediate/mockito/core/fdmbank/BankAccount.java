package com.fdmgroup.intermediate.mockito.core.fdmbank;

import java.math.BigDecimal;

public class BankAccount {

	private long accountId;
	private String sortCode;
	private BigDecimal balance;
	
	public BankAccount() {}
	
	public BankAccount(long accountId, String sortCode, BigDecimal balance) {
		super();
		this.accountId = accountId;
		this.sortCode = sortCode;
		this.balance = balance;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (accountId ^ (accountId >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BankAccount other = (BankAccount) obj;
		if (accountId != other.accountId)
			return false;
		return true;
	}

	public long getAccountId() {
		return accountId;
	}

	public void setAccountId(long accountId) {
		this.accountId = accountId;
	}

	public String getSortCode() {
		return sortCode;
	}

	public void setSortCode(String sortCode) {
		this.sortCode = sortCode;
	}

	public BigDecimal getBalance() {
		return balance;
	}

	public void setBalance(BigDecimal balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "BankAccount [accountId=" + accountId + ", sortCode=" + sortCode + ", balance=" + balance + "]";
	}

}
