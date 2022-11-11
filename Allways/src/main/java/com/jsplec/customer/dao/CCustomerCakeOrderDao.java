package com.jsplec.customer.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import com.jsplec.customer.dto.CCustomerCakeOrderDto;
import com.jsplec.customer.dto.CCustomerCartListDto;

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
						+ CUSTOMERID + "' " + "and ordersId = " + ORDERSID;

				preparedStatement = connection.prepareStatement(query1 + query2);
				resultSet = preparedStatement.executeQuery();

				int ordersId = resultSet.getInt("ordersId");
				int ordersSalePrice = resultSet.getInt("ordersSalePrice");
				int ordersQuantity = resultSet.getInt("ordersQuantity");
				String cakeName = resultSet.getString("cakeName");

				CCustomerCakeOrderDto dto = new CCustomerCakeOrderDto(ordersId, ordersSalePrice, ordersQuantity,
						cakeName);
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
