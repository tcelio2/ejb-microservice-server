package com.example.demo.ejb;

import javax.ejb.Remote;

import com.example.demo.InsufficientFundsException;

@Remote
public interface Account {

	public void deposit(long amount);
	public void withdraw(long amount) throws InsufficientFundsException;
	
	public long getMoney();
	public void createAccount(long amount);
}
