package com.fdmgroup.intermediate.mockito.core.fdmbank;

import java.math.BigDecimal;

import com.fdmgroup.intermediate.mockito.core.respository.CRUD;

public class FDMBankAccountService implements BankAccountService{

	private CRUD<BankAccount> bankAccountCRUD;
	
	public FDMBankAccountService(CRUD<BankAccount> bankAccountCRUD) {
		this.bankAccountCRUD=bankAccountCRUD;
	}
	
	@Override
	public boolean withdraw(BankAccount bankAccount, BigDecimal withdrawlAmount) {		
		if(withdrawlLessThanAvailableBalance(withdrawlAmount, bankAccount.getBalance())) {
			bankAccount.setBalance(bankAccount.getBalance().subtract(withdrawlAmount));
			bankAccountCRUD.update(bankAccount);
			return true;
		}
		return false;
	}

	@Override
	public void deposit(BankAccount bankAccount, BigDecimal depositAmount) {
		if(depositAmount.signum() > 0 ) {
			bankAccount.setBalance(bankAccount.getBalance().add(depositAmount));	
		}
	}

	@Override
	public BigDecimal checkBalance(BankAccount bankAccount) {
		return bankAccount.getBalance();
	}
	
	private boolean withdrawlLessThanAvailableBalance(BigDecimal withdrawlAmount, BigDecimal startingBalance) {
		BigDecimal minimumBalance = new BigDecimal(0);		
		return startingBalance.subtract(withdrawlAmount).compareTo(minimumBalance) >= 0;
	}

}
