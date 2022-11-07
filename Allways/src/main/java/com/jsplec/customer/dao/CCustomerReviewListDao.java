package com.jsplec.customer.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import com.jsplec.customer.dto.CCustomerReviewListDto;

public class CCustomerReviewListDao {

	DataSource dataSource;
	
	public CCustomerReviewListDao() {
		try {
			Context context = new InitialContext();
			dataSource = (DataSource) context.lookup("java:comp/env/jdbc/mvc");
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public ArrayList<CCustomerReviewListDto> reviewList(String radio, String searchContent, String combo) {
		
		ArrayList<CCustomerReviewListDto> dtos = new ArrayList<CCustomerReviewListDto>();
		
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet rs = null;
		
		try {
			connection = dataSource.getConnection();
			
			String query1 = "select oreviewId, or_customerId, oreviewContent, oreviewInitdate from ordersreview where " + combo + " like '%" + searchContent + "%' ";
			String query2 = "order by " + radio + " desc";
			
			preparedStatement = connection.prepareStatement(query1 + query2);
			
			rs = preparedStatement.executeQuery();
			
			while(rs.next()) {

				int oreviewId = rs.getInt(1);
				String or_customerId = rs.getString(2);
				String oreviewContent = rs.getString(3);
				Date oreviewInitdate = rs.getDate(4);
				
				CCustomerReviewListDto dto = new CCustomerReviewListDto(oreviewId, or_customerId, oreviewContent, oreviewInitdate);
				dtos.add(dto);
			}
			
		} catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(rs != null) rs.close();
				if(preparedStatement != null) preparedStatement.close();
				if(connection != null) connection.close();
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
		return dtos;
	} // productDetailSize() --
	
}
