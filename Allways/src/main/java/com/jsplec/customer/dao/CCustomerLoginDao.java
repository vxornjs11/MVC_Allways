package com.jsplec.customer.dao;

import javax.sql.DataSource;

import com.mysql.cj.xdevapi.Result;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.naming.Context;
import javax.naming.InitialContext;

public class CCustomerLoginDao {

	// F
	DataSource dataSource;
	
	// C
	public CCustomerLoginDao() {
		// TODO Auto-generated constructor stub
		try {
			Context context = new InitialContext();
			dataSource = (DataSource) context.lookup("java:comp/env/jdbc/mvc"); // 데이터베이스 연결 끝
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	// M
	public String login(String customerId, String customerPw) {
		Connection connection = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		int count = 0;
		String name = "";

		try {
			connection = dataSource.getConnection();

			String query = "select count(*), customerName from customer where customerId = '" + customerId + "' and customerPw = '" + customerPw + "' and customerDeletedate is null";
			ps = connection.prepareStatement(query);
			rs = ps.executeQuery();

			if (rs.next()) {
				count = rs.getInt(1);
				name = rs.getString(2);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs!=null) rs.close();
				if(ps!=null)ps.close();
				if (connection!=null) connection.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		
		return name;
	} 
	
	
}// End
