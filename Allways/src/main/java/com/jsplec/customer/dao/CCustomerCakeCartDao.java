package com.jsplec.customer.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
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

	public void cartInsert(String CUSTOMERID, int CAKEID, String CAKENAME, int CAKEPRICE, int ORDERSQUANTITY) {

		Connection connection = null;
		PreparedStatement preparedStatement = null;

		try {
			connection = dataSource.getConnection();

			String query1 = "insert into orders (ordersStatus, o_customerId, o_cakeId, o_goodsId, ordersSalePrice, ordersQuantity, ordersDate, ordersPoint) ";
			String query2 = "values ('장바구니', ?, ?, 1, ?, ?, now(), ?)";
			
			preparedStatement = connection.prepareStatement(query1 + query2);
			
			
			preparedStatement.setString(1, CUSTOMERID);
			preparedStatement.setInt(2, CAKEID);
			preparedStatement.setString(3, CAKENAME);
			preparedStatement.setInt(4, CAKEPRICE * ORDERSQUANTITY);
			preparedStatement.setInt(5, ORDERSQUANTITY);
			preparedStatement.setInt(6, (int)((CAKEPRICE * ORDERSQUANTITY) *  0.02));

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
	} // cartInsert() --
}
