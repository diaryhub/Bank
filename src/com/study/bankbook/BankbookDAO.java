package com.study.bankbook;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

import com.study.util.DBConnector;

public class BankbookDAO {
	private DBConnector dbConnector;
	private Scanner sc;
	
	public BankbookDAO() {
		dbConnector = new DBConnector();
		sc = new Scanner(System.in);
	}
	
	public int setInsert(BankbookDTO bankbookDTO) throws Exception {
		
		Connection con = dbConnector.getConnect();
		String sql = "INSERT INTO BANKBOOK VALUES( (SELECT BKNUMBER_SEQ.NEXTVAL FROM DUAL) , ? , ? , ? , ? )";
		PreparedStatement st = con.prepareStatement(sql);
		st.setDouble(1, bankbookDTO.getInterest_rate());
		st.setString(2, bankbookDTO.getBankbook_info());
		st.setString(3, bankbookDTO.getOn_sale());
		st.setString(4, bankbookDTO.getBankbook_name());
		
		int result = st.executeUpdate();
		
		st.close();
		con.close();
		
		return result;
	}
	
	public int setUpdate (BankbookDTO bankbookDTO) throws Exception { 
		
		Connection con = dbConnector.getConnect();
		String sql = "UPDATE BANKBOOK SET ON_SALE = ? WHERE BANKBOOK_NUMBER = ? ";
		PreparedStatement st = con.prepareStatement(sql);
		System.out.print("상품 판매 여부:");
		st.setString(1, sc.next());
		st.setInt(2, bankbookDTO.getBankbook_number());
		int result = 0;
		st.close();
		con.close();
		return result;
	}
	
	
	public int setDelete (BankbookDTO bankbookDTO) throws Exception { 
		
		Connection con = dbConnector.getConnect();
		String sql = "DELETE BANKBOOK WHERE BANKBOOK_NUMBER = ? ";
		PreparedStatement st = con.prepareStatement(sql);
		st.setInt(1, bankbookDTO.getBankbook_number());
		
		int result=0;
		
		st.close();
		con.close();
		
		return result;
	}
}
