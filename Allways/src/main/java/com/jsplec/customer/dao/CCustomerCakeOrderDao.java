package com.jsplec.customer.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Iterator;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import com.jsplec.customer.dto.CCustomerCakeOrderDto;

public class CCustomerCakeOrderDao {

	DataSource dataSource;

	public CCustomerCakeOrderDao() {
		try {
			Context context = new InitialContext();
			dataSource = (DataSource) context.lookup("java:comp/env/jdbc/mvc");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public ArrayList<CCustomerCakeOrderDto> orderList(String CUSTOMERID, String[] ORDERSID) {
		ArrayList<CCustomerCakeOrderDto> dtos = new ArrayList<CCustomerCakeOrderDto>();
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;

		try {
			connection = dataSource.getConnection();

			for (int i = 0; i < ORDERSID.length; i++) {
				String query1 = "select o.ordersId, o.ordersQuantity, o.ordersSalePrice, c.cakeName from cake c, orders o ";
				String query2 = "where o.o_cakeId = c.cakeId and ordersStatus = '장바구니' and o.o_customerId = '"
						+ CUSTOMERID + "' and ordersId = '" + ORDERSID[i] + "'";

				preparedStatement = connection.prepareStatement(query1 + query2);
				resultSet = preparedStatement.executeQuery();

				while (resultSet.next()) {

					int ordersId = resultSet.getInt(1);
					int ordersQuantity = resultSet.getInt(2);
					int ordersSalePrice = resultSet.getInt(3);
					String cakeName = resultSet.getString(4);

					CCustomerCakeOrderDto dto = new CCustomerCakeOrderDto(ordersId, ordersSalePrice, ordersQuantity,
							cakeName);
					dtos.add(dto);
				}

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

	public ArrayList<CCustomerCakeOrderDto> customerInfo(String CUSTOMERID) {
		ArrayList<CCustomerCakeOrderDto> dtos = new ArrayList<CCustomerCakeOrderDto>();
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;

		try {
			connection = dataSource.getConnection();

			String query1 = "select customerName, customerPhone, customerEmail, customerPostcode, customerAddress, customerAddressDetail ";
			String query2 = "from customer where customerId = '" + CUSTOMERID + "'";

			preparedStatement = connection.prepareStatement(query1 + query2);
			resultSet = preparedStatement.executeQuery();

			while (resultSet.next()) {

				String customerName = resultSet.getString(1);
				String customerPhone = resultSet.getString(2);
				String customerEmail = resultSet.getString(3);
				String customerPostcode = resultSet.getString(4);
				String customerAddress = resultSet.getString(5);
				String customerAddressDetail = resultSet.getString(6);

				CCustomerCakeOrderDto dto = new CCustomerCakeOrderDto(customerName, customerPhone, customerEmail,
						customerPostcode, customerAddress, customerAddressDetail);
				dtos.add(dto);
			}

		} catch (

		Exception e) {
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

	public void orderInsert(String CUSTOMERID, int CAKEID, int CAKEPRICE, int ORDERSQUANTITY, int ORDERSID) {

		Connection connection = null;
		PreparedStatement preparedStatement = null;

		try {
			connection = dataSource.getConnection();
			
				

			String query1 = "insert into orders (ordersStatus, o_customerId, o_cakeId, o_goodsId, ordersSalePrice, ordersQuantity, ordersDate, ordersPoint) ";
			String query2 = "values ('구매', ?, ?, 1, ?, ?, now(), ?, " + ORDERSID + ")";

			preparedStatement = connection.prepareStatement(query1 + query2);

			preparedStatement.setString(1, CUSTOMERID);
			preparedStatement.setInt(2, CAKEID);
			preparedStatement.setInt(3, CAKEPRICE * ORDERSQUANTITY);
			preparedStatement.setInt(4, ORDERSQUANTITY);
			preparedStatement.setInt(5, (int) ((CAKEPRICE * ORDERSQUANTITY) * 0.05));
			preparedStatement.setInt(6, ORDERSID);

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
