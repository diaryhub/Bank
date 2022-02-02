package com.study.start;

public class Main {

	public static void main(String[] args) throws Exception {
		System.out.println("작업실행");
		BankSystem bankSystem = new BankSystem();
		bankSystem.mainStart();
		System.out.println("작업완료.");
	}

}
