package com.study.transaction;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

import com.study.util.DBConnector;

public class TransactionDAO {
	
	private DBConnector dbConnector;
	private Scanner sc;
	
	public TransactionDAO() {
		dbConnector = new DBConnector();
		sc = new Scanner(System.in); 
	}
	
public int setInsert(TransactionDTO transactionDTO) throws Exception {
		
		Connection con = dbConnector.getConnect();
		String sql = "INSERT INTO TRANSACTION VALUES( (SELECT TRANSACTION_SEQ.NEXTVAL FROM DUAL) , ? , (SELECT SYSDATE FROM DUAL) , ? , ? )";
		PreparedStatement st = con.prepareStatement(sql);
		st.setString(1, transactionDTO.getAccount_number());
		st.setInt(2, transactionDTO.getAmount());
		st.setString(3, transactionDTO.getTrade());
		
		int result = st.executeUpdate();
		
		st.close();
		con.close();
		
		return result;
	}
	
}
