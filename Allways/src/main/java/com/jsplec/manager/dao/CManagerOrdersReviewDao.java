package com.jsplec.manager.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.util.ArrayList;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import com.jsplec.manager.dto.goodsDto;
import com.jsplec.manager.dto.ordersReviewDto;

public class CManagerOrdersReviewDao {
	
	DataSource dataSource;

	public CManagerOrdersReviewDao() {
		try {
			Context context = new InitialContext();
			dataSource = (DataSource) context.lookup("java:comp/env/jdbc/mvc");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public ArrayList<ordersReviewDto> showOrdersReviewOnMain(){
		ArrayList<ordersReviewDto> dtos=new ArrayList<ordersReviewDto>();
		
		Connection connection = null;
		PreparedStatement ps = null;
		ResultSet rs = null;

		try {
			connection = dataSource.getConnection();
			String query = "select or_customerId, oreviewStarrating, oreviewInitdate from ordersreview order by oreviewInitdate desc; ";
			String query2 = "where oreviewDeletedate is null";

			ps = connection.prepareStatement(query + query2);
			rs = ps.executeQuery();

			while (rs.next()) {
				String wkor_customerId = rs.getString(1);
				int wkoreviewStarrating = rs.getInt(2);
				Timestamp wkoreviewInitdate=rs.getTimestamp(3);

				ordersReviewDto dto = new ordersReviewDto(wkor_customerId, wkoreviewStarrating, wkoreviewInitdate);
				dtos.add(dto);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null)
					rs.close();
				if (ps != null)
					ps.close();
				if (connection != null)
					connection.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		
		return dtos;
	}
}
