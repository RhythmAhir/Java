package com.fdmgroup.intermediate.mockito.core.fdmbank;

import java.math.BigDecimal;

public interface BankAccountService {

	boolean withdraw(BankAccount bankAccount, BigDecimal withdrawlAmount);
	void deposit(BankAccount bankAccount, BigDecimal depositAmount);
	BigDecimal checkBalance(BankAccount bankAccount);
	
}
