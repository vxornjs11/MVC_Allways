package com.jsplec.customer.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import com.jsplec.customer.dto.CCustomerCakeListDto;

public class CCustomerCakeDetailDao {
	
	// Field
	
	DataSource dataSource;
	
	// Constructor
	
	public CCustomerCakeDetailDao() {
		try {
			Context context = new InitialContext();
			dataSource = (DataSource) context.lookup("java:comp/env/jdbc/mvc");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	// Method
	
	// product detail
	public ArrayList<CCustomerCakeListDto> productDetail(String queryName, String content) {
		ArrayList<CCustomerCakeListDto> dtos = new ArrayList<CCustomerCakeListDto>();
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;

		try {
			connection = dataSource.getConnection();

			String query1 = "select cakeId, cakeName, cakePrice, cakeImage, cakeLike, cakeViews from cake ";
			String query2 = "where cakeId =  " + content;

			preparedStatement = connection.prepareStatement(query1 + query2);
			resultSet = preparedStatement.executeQuery();

			while (resultSet.next()) {
				int cakeId = resultSet.getInt("cakeId");
				String cakeName = resultSet.getString("cakeName");
				int cakePrice = resultSet.getInt("cakePrice");
				String cakeImage= resultSet.getString("cakeImage");
				int cakeLike = resultSet.getInt("cakeLike");
				int cakeViews = resultSet.getInt("cakeViews");

				CCustomerCakeListDto dto = new CCustomerCakeListDto(cakeId, cakeName, cakePrice, cakeImage, cakeLike, cakeViews);
				dtos.add(dto);
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (resultSet != null)
					resultSet.close();
				if (preparedStatement != null)
					preparedStatement.close();
				if (connection != null)
					connection.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return dtos;

	}
	
}
