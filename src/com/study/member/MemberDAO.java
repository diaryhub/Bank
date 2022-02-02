package com.study.member;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

import com.study.util.DBConnector;

public class MemberDAO {

	private DBConnector dbConnector;
	private Scanner sc;
	
	public MemberDAO() {
		dbConnector = new DBConnector();
		sc = new Scanner(System.in);
	}
	
	public int setInsert(MemberDTO memberDTO) throws Exception {
		
		Connection con = dbConnector.getConnect();
		String sql = "INSERT INTO BANK_MEMBER VALUES( ? , ? , ? , ? , ? )";
		PreparedStatement st = con.prepareStatement(sql);
		st.setString(1, memberDTO.getId());
		st.setString(2, memberDTO.getPw());
		st.setString(3, memberDTO.getEmail());
		st.setString(4, memberDTO.getPhone());
		st.setString(5, memberDTO.getName());
		
		int result = st.executeUpdate();
		
		st.close();
		con.close();
		
		return result;
	}
	
	public int setUpdate (MemberDTO memberDTO) throws Exception { 
		
		Connection con = dbConnector.getConnect();
		String sql = "UPDATE BANK_MEMBER SET PW = ? ,  EMAIL = ? , PHONE = ? , NAME = ? WHERE ID = ? ";
		PreparedStatement st = con.prepareStatement(sql);
		System.out.print("변경할 비밀번호:");
		st.setString(1, sc.next());
		System.out.print("변경할 이메일:");
		st.setString(2, sc.next());
		System.out.print("변경할 전화번호:");
		st.setString(3, sc.next());
		System.out.print("변경할 이름:");
		st.setString(4, sc.next());
		st.setString(5, memberDTO.getId());
		int result = 0;
		st.close();
		con.close();
		return result;
	}
	
	
	public int setDelete (MemberDTO memberDTO) throws Exception { 
		
		Connection con = dbConnector.getConnect();
		String sql = "DELETE BANK_MEMBER WHERE ID = ? ";
		PreparedStatement st = con.prepareStatement(sql);
		st.setString(1, memberDTO.getId());
		
		int result=0;
		
		st.close();
		con.close();
		
		return result;
	}

	
}
