package model.entities;

import model.exceptions.BusinessException;

public class Account {

	private Integer number;
	private String holder;
	private Double balance;
	private Double withdrawLimit;
	
	public Account(Integer number, String holder, Double balance, Double withdrawLimit) {
		this.number = number;
		this.holder = holder;
		this.balance = balance;
		this.withdrawLimit = withdrawLimit;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public Double getBalance() {
		return balance;
	}

	public Double getWithdrawLimit() {
		return withdrawLimit;
	}

	public void setWithdrawLimit(Double withdrawLimit) {
		this.withdrawLimit = withdrawLimit;
	}
	
	public void withDraw(double withdraw) {
		validateWithdraw(withdraw);
		balance -= withdraw;
	}
	
	public void validateWithdraw(double amount) {
		if (withdrawLimit < amount) {
			throw new BusinessException("Erro de saque: A quantia excede o limite de saque");
		} else if (balance < amount) {
			throw new BusinessException("Erro de saque: Saldo insuficiente");
		}
	}
	
	public void deposit(double deposit) {
		balance += deposit;
	}
}
