package com.jsplec.manager.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.util.ArrayList;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import com.jsplec.manager.dto.salesDto;

public class CManagerMainDao {
	
	DataSource dataSource;

	public CManagerMainDao() {
		try {
			Context context = new InitialContext();
			dataSource = (DataSource) context.lookup("java:comp/env/jdbc/mvc");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public ArrayList<salesDto> showSales() {
		ArrayList<salesDto> dtos=new ArrayList<salesDto>();
		
		Connection connection = null;
		PreparedStatement ps = null;
		ResultSet rs = null;

		try {
			connection = dataSource.getConnection();

			String query = "select date(ordersDate), sum(ordersSalePrice), sum(ordersQuantity) where ordersStatus='주문접수' group by date(ordersDate) order by date(ordersDate);";
			ps = connection.prepareStatement(query);
			rs = ps.executeQuery();

			while (rs.next()) {
				Timestamp ordersDate = rs.getTimestamp("1");
				int sumOrdersSalePrice = rs.getInt("2");
				int sumOrdersQuantity = rs.getInt("3");

				salesDto dto = new salesDto(sumOrdersQuantity, sumOrdersSalePrice, ordersDate);
				dtos.add(dto);
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
		
		return dtos;
	}
}
