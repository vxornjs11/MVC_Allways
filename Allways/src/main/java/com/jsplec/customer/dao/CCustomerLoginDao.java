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
	public boolean userCheck(String customerId, String customerPw) {
		Connection connection = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		int count = 0;

		try {
			connection = dataSource.getConnection();

			String query = "select count(*) from customer where customerId = '" + customerId + "' and customerPw = '" + customerPw + "' and customerDeletedate is null";
			ps = connection.prepareStatement(query);
			rs = ps.executeQuery();

			if (rs.next()) {
				count = rs.getInt(1);
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
		
		if (count==1) {
			return true;
		} else {
			return false;
		}
	} 
	
	public String userName(String customerId, String customerPw) {
		Connection connection = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		String name = "";
		boolean check = userCheck(customerId, customerPw);
		
		if (check==true) {
			try {
				connection = dataSource.getConnection();

				String query = "select customerName from customer where customerId='" + customerId + "' and customerPw='" + customerPw + "' and customerDeletedate is null";
				ps = connection.prepareStatement(query);
				rs = ps.executeQuery();

				if (rs.next()) {
					name=rs.getString(1);
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
		} else {
			name=null;
		}
		
		return name;
		
	}
	
	public String userFindId(String customerName, String customerBirthday , String customerPhone, String customerEmail) {
		Connection connection = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		String customerId=null;

		try {
			connection = dataSource.getConnection();

			String query = "select customerId from customer where customerName = '" + customerName + "' and customerBirthday = '" + customerBirthday + "' and customerPhone = '" + customerPhone + "' and customerEmail = '" + customerEmail + "' and customerDeletedate is null";
			ps = connection.prepareStatement(query);
			rs = ps.executeQuery();

			if (rs.next()) {
				customerId=rs.getString(1);
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
		
		return customerId;
	}
	
	
	
	
}// End
