package com.jsplec.customer.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.sql.DataSource;

public class CCustomerCartDeleteDao {
	
	DataSource dataSource;

	public void cartDelete(int ORDERSID) {

		Connection connection = null;
		PreparedStatement preparedStatement = null;

		try {
			connection = dataSource.getConnection();

			String query = "delete from orders where ordersId = ?";

			preparedStatement = connection.prepareStatement(query);

			preparedStatement.setInt(1, ORDERSID);

			preparedStatement.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (preparedStatement != null)
					preparedStatement.close();
				if (connection != null)
					connection.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

}
