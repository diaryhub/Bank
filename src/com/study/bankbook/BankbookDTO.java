package com.study.bankbook;

public class BankbookDTO {
	private Integer bankbook_number;
	private Double interest_rate;
	private String bankbook_info;
	private String on_sale;
	private String bankbook_name;
	
	public Integer getBankbook_number() {
		return bankbook_number;
	}
	public void setBankbook_number(Integer bankbook_number) {
		this.bankbook_number = bankbook_number;
	}
	public Double getInterest_rate() {
		return interest_rate;
	}
	public void setInterest_rate(Double interest_rate) {
		this.interest_rate = interest_rate;
	}
	public String getBankbook_info() {
		return bankbook_info;
	}
	public void setBankbook_info(String bankbook_info) {
		this.bankbook_info = bankbook_info;
	}
	public String getOn_sale() {
		return on_sale;
	}
	public void setOn_sale(String on_sale) {
		this.on_sale = on_sale;
	}
	public String getBankbook_name() {
		return bankbook_name;
	}
	public void setBankbook_name(String bankbook_name) {
		this.bankbook_name = bankbook_name;
	}
	
}
