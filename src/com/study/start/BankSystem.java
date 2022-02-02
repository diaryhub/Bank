package com.study.start;

import java.util.Scanner;

import com.study.member.MemberController;


public class BankSystem {
	
	private MemberController memberController;
	
	public BankSystem() {
		memberController = new MemberController();
	}
	
	public void mainStart() throws Exception {

		Scanner sc = new Scanner(System.in);

		

		int select = sc.nextInt();

		boolean flag = true;
		while (flag) {
			
			System.out.println("실행할 작업을 선택하세요.");
			System.out.println("1. 회원 정보");
			System.out.println("2. 통장 정보");
			System.out.println("3. 계좌 정보");
			System.out.println("4. 종료");
			
			switch (select) {
			case 1:
				memberController.start();
				break;
			case 2:

				break;
			case 3:

				break;
			default:
				System.out.println("시스템 종료");
				flag = false;
			}

		}
	}

}
