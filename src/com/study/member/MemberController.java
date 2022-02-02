package com.study.member;

import java.util.Scanner;

public class MemberController {
	
	private Scanner sc;
	private MemberDAO memberDAO; 
	
	public MemberController() {
		sc = new Scanner(System.in);
		memberDAO = new MemberDAO();
	}
	
	public void start() throws Exception {
		
		boolean flag = true;
		
		while(flag) {
		
		System.out.println("작업을 선택하세요.");
		System.out.println("1. 회원 정보 추가");
		System.out.println("2. 회원 정보 수정");
		System.out.println("3. 회원 정보 삭제");
		System.out.println("4. 이전 화면으로");
		
		int select = sc.nextInt();
		int result = 0;
		MemberDTO memberDTO = new MemberDTO();
		
		switch(select) {
		case 1:
			System.out.println("추가할 회원의 ID:");
			memberDTO.setId(sc.next());
			System.out.println("추가할 회원의 비밀번호:");
			memberDTO.setPw(sc.next());
			System.out.println("추가할 회원의 이메일:");
			memberDTO.setEmail(sc.next());
			System.out.println("추가할 회원의 휴대전화:");
			memberDTO.setPhone(sc.next());
			System.out.println("추가할 회원의 이름:");
			memberDTO.setName(sc.next());
			result = memberDAO.setInsert(memberDTO);
			if(result>0) {
			System.out.println("입력완료");
			}
			break;
		case 2:	
			System.out.println("변경할 회원의 ID 입력:");
			memberDTO.setId(sc.next());
			result = memberDAO.setUpdate(memberDTO);
			if(result>0) {
				System.out.println("변경완료");
				}
			break;
		case 3:
			System.out.println("삭제할 회원의 ID 입력:");
			memberDTO.setId(sc.next());
			result = memberDAO.setDelete(memberDTO);
			if(result>0) {
				System.out.println("삭제완료");
				}
			break;
		default:
			flag = false;
		}
		
		
		}
		
	}
	
	
}
