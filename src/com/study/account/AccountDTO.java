package com.study.account;

import java.sql.Date;

public class AccountDTO {
	
	private String account_number;
	private String id;
	private Integer bankbook_number;
	private Integer balance;
	private Date create_date;
	
	public String getAccount_number() {
		return account_number;
	}
	public void setAccount_number(String account_number) {
		this.account_number = account_number;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Integer getBankbook_number() {
		return bankbook_number;
	}
	public void setBankbook_number(Integer bankbook_number) {
		this.bankbook_number = bankbook_number;
	}

	public Integer getBalance() {
		return balance;
	}
	public void setBalance(Integer balance) {
		this.balance = balance;
	}
	public Date getCreate_date() {
		return create_date;
	}
	public void setCreate_date(Date create_date) {
		this.create_date = create_date;
	}
	
}
