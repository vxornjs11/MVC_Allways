package com.jsplec.customer.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import com.jsplec.customer.dto.CCustomerWriteListDto;

public class CCustomerWriteListDao {

	DataSource dataSource;
	
	public CCustomerWriteListDao() {
		try {
			Context context = new InitialContext();
			dataSource = (DataSource) context.lookup("java:comp/env/jdbc/mvc");
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public ArrayList<CCustomerWriteListDto> writeList() {
		
		ArrayList<CCustomerWriteListDto> dtos = new ArrayList<CCustomerWriteListDto>();
		
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet rs = null;
		
		try {
			connection = dataSource.getConnection();
			
			String query = "select * from (select row_number() over(order by commentId desc) as rownum, "
					+ "writeTitle, writeContent, w_customerId, writeInitdate, recommentId from `write` order by commentId desc) w";
			
//			String query = "select w_customerId, writeTitle, writeContent, writeInitdate from `write` ";
			
			preparedStatement = connection.prepareStatement(query);
			
			rs = preparedStatement.executeQuery();
			
			while(rs.next()) {
				
				int rowNum = rs.getInt(1);
				String writeTitle = rs.getString(2);
				String writeContent = rs.getString(3);
				String w_customerId = rs.getString(4);
				Date writeInitdate = rs.getDate(5);
				int recommentId = rs.getInt(6);
				
				CCustomerWriteListDto dto = new CCustomerWriteListDto(rowNum, writeTitle, writeContent, w_customerId, writeInitdate, recommentId);
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
	} // reviewList1() --
	
}
