package com.study.transaction;

import java.sql.Date;

public class TransactionDTO {
	
	private Integer transaction_number;
	private String account_number;
	private Date deal_date;
	private Integer amount;
	private String trade;
	
	public String getTrade() {
		return trade;
	}
	public void setTrade(String trade) {
		this.trade = trade;
	}
	public Integer getTransaction_number() {
		return transaction_number;
	}
	public void setTransaction_number(Integer transaction_number) {
		this.transaction_number = transaction_number;
	}
	public String getAccount_number() {
		return account_number;
	}
	public void setAccount_number(String account_number) {
		this.account_number = account_number;
	}
	public Date getDeal_date() {
		return deal_date;
	}
	public void setDeal_date(Date deal_date) {
		this.deal_date = deal_date;
	}
	public Integer getAmount() {
		return amount;
	}
	public void setAmount(Integer amount) {
		this.amount = amount;
	}
	
}
