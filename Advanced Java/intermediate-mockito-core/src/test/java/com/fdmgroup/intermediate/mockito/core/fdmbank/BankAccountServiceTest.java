package com.fdmgroup.intermediate.mockito.core.fdmbank;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import java.math.BigDecimal;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.fdmgroup.intermediate.mockito.core.respository.CRUD;

public class BankAccountServiceTest {

	private BankAccountService bankAccountService;
	private BankAccount bankAccount;
	
	@Mock
	private CRUD<BankAccount> mockedBankAccountCRUD;
	
	@BeforeEach
	public void init() {
		MockitoAnnotations.initMocks(this);
		bankAccountService = new FDMBankAccountService(mockedBankAccountCRUD);
		bankAccount = new BankAccount(500l,"10-03-12",new BigDecimal(100));
	}
	
	@Test
	public void verifyThatBankAccountServiceCallsBankAccountCRUDWhenWithdrawlIsSuccessfull() {
		BigDecimal withdrawAmount = new BigDecimal(10);
		bankAccountService.withdraw(bankAccount, withdrawAmount);
		verify(mockedBankAccountCRUD,times(1)).update(bankAccount);
	}
	
	@Test
	public void verifyThatBankAccountServiceDoesNotCallBankAccountCRUDWhenWithdrawlFails() {
		BigDecimal withdrawAmount = new BigDecimal(1000);
		bankAccountService.withdraw(bankAccount, withdrawAmount);
		verify(mockedBankAccountCRUD,times(0)).update(bankAccount);
	}
}
