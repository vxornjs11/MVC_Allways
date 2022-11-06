package com.jsplec.customer.dao;

import javax.sql.DataSource;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.naming.Context;
import javax.naming.InitialContext;


public class CCustomerJoinDao {

	// F
	DataSource dataSource;
	
	// C
	public CCustomerJoinDao() {
		// TODO Auto-generated constructor stub
		try {
			Context context = new InitialContext();
			dataSource = (DataSource) context.lookup("java:comp/env/jdbc/mvc");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	// M
	public boolean idCheck(String customerid) {
		Connection connection = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		int count=0;

		try {
			connection = dataSource.getConnection();

			String query = "select count(*) from customer where customerId=? and customerDeletedate is null";
			ps = connection.prepareStatement(query);
			ps.setString(1, customerid);
			rs = ps.executeQuery();

			if (rs.next()) {
				count=rs.getInt(1);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs!=null) rs.close();
				if(ps!=null)ps.close();
				if (connection!=null) connection.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		if (count==1) {
			return true;
		} else {
			return false;
		}
	} // idCheck
	
	
	
	
} // End
