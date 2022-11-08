package com.jsplec.customer.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class CCustomerWriteReviewDao {

DataSource dataSource;
	
	public CCustomerWriteReviewDao() {
		try {
			Context context = new InitialContext();
			dataSource = (DataSource) context.lookup("java:comp/env/jdbc/mvc");
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public boolean writeReview(int ordersId, String oreviewStarRating, String oreviewContent, String uploadFile) {
		//write
		Connection connection = null;
		PreparedStatement ps = null;
		boolean result = false;
		
		try {
			connection = dataSource.getConnection();
			
			String query = "insert into ordersreview (or_customerId, or_ordersId, or_ordersStatus, oreviewContent, oreviewStarRating, oreviewImage, oreviewInitdate) values (?, ?, ?, ?, ?, ?, now())";
			ps = connection.prepareStatement(query);
			
			ps.setString(1, "user");
			ps.setInt(2, ordersId);
			ps.setString(3, "제작완료");
			ps.setString(4, oreviewContent);
			ps.setString(5, oreviewStarRating);
			ps.setString(6, uploadFile);
			
			ps.executeUpdate();
			result = true;
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(ps != null) ps.close();
				if(connection != null) connection.close();
			}catch(Exception e) {
				e.printStackTrace();
				
			}
		}
		return result;
		
	}//write

	
	public void writeReviewUpdate(int ordersId) {
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		
		try {
			connection = dataSource.getConnection();
			
			String query = "update orders set ordersReviewstatus = '작성완료' where ordersId = ? and ordersStatus = '제작완료';";
			preparedStatement = connection.prepareStatement(query);
			
			preparedStatement.setInt(1, ordersId);
			
			preparedStatement.executeUpdate();
			
		} catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(preparedStatement != null) preparedStatement.close();
				if(connection != null) connection.close();
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
	} // writeReviewUpdate() --
	
	
}
