package com.jsplec.customer.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import com.jsplec.customer.dto.CCustomerCakeCartDto;

public class CCustomerCakeCartDao {

	DataSource dataSource;

	public CCustomerCakeCartDao() {
		try {
			Context context = new InitialContext();
			dataSource = (DataSource) context.lookup("java:comp/env/jdbc/mvc");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public CCustomerCakeCartDto cakeOption(int CAKEID, int CAKEOPTIONID) {

		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		CCustomerCakeCartDto dto = null;

		try {
			connection = dataSource.getConnection();

			String query1 = "insert into detailoption (d_cakeoptionId, d_ordersId, d_ordersStatus, d_customerId, d_cakeId, d_goodsId, ";
			String query2 = "detailoptionLettering values(" + CAKEOPTIONID + ", ";

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
		return dto;
	}
}
