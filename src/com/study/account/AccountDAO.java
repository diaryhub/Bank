package com.study.account;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

import com.study.util.DBConnector;

public class AccountDAO {
	
	private DBConnector dbConnector;
	private Scanner sc;
	
	public AccountDAO() {
		dbConnector = new DBConnector();
		sc = new Scanner(System.in); 
	}
	
public int setInsert(AccountDTO accountDTO) throws Exception {
		
		Connection con = dbConnector.getConnect();
		String sql = "INSERT INTO ACCOUNT VALUES( ? , ? , ? , ? , ? )";
		PreparedStatement st = con.prepareStatement(sql);
		st.setString(1, accountDTO.getAccount_number());
		st.setString(2, accountDTO.getId());
		st.setInt(3, accountDTO.getBankbook_number());
		st.setInt(4, accountDTO.getBalance());
		st.setDate(4, accountDTO.getCreate_date());
		
		int result = st.executeUpdate();
		
		st.close();
		con.close();
		
		return result;
	}
	
	public int setUpdate(AccountDTO accountDTO)throws Exception {
		
		Connection con = dbConnector.getConnect();
		String sql = "UPDATE ACCOUNT SET BALANCE = ? WHERE ACCOUNT_NUMBER = ?";
		PreparedStatement st = con.prepareStatement(sql);
		st.setLong(1, 0);
		st.setString(2, accountDTO.getAccount_number());
		int result = st.executeUpdate();
		
		st.close();
		con.close();
		
		return result;
	}
	
public int setDelete (AccountDTO accountDTO) throws Exception { 
		
		Connection con = dbConnector.getConnect();
		String sql = "DELETE ACCOUNT WHERE ACCOUNT_NUMBER = ? ";
		PreparedStatement st = con.prepareStatement(sql);
		st.setString(1, accountDTO.getAccount_number());
		
		int result=0;
		
		st.close();
		con.close();
		
		return result;
	}
	

}
