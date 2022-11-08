package com.jsplec.manager.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import com.jsplec.manager.dto.CManagerOptionListDto;
import com.jsplec.manager.dto.CManagerOrderStautsDTo;
import com.mysql.cj.Session;

public class CManagerOrderStausDao {

	
	DataSource dataSource;

public CManagerOrderStausDao() {
	// TODO Auto-generated constructor stub
	try {
			Context context = new InitialContext();
			dataSource = (DataSource) context.lookup("java:comp/env/jdbc/mvc");
	}catch (Exception e) {
		e.printStackTrace();// TODO: handle exception
	}
}


	public ArrayList<CManagerOrderStautsDTo> orderStautsList(){
		ArrayList<CManagerOrderStautsDTo> dtos = new ArrayList<CManagerOrderStautsDTo>();
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		
		try { 
				connection = dataSource.getConnection();
				
				String query = "select ordersId,ordersStatus,o_customerId,o_cakeId,o_goodsId,ordersSalePrice,ordersQuantity from orders where ordersStatus =0";
				preparedStatement = connection.prepareStatement(query);
				resultSet = preparedStatement.executeQuery();
					
				while(resultSet.next()) {
					int ordersId = resultSet.getInt("ordersId");
					String ordersStatus = resultSet.getString("ordersStatus");
					String o_customerId = resultSet.getString("o_customerId");
					int o_cakeId = resultSet.getInt("o_cakeId");
					int o_goodsId = resultSet.getInt("o_goodsId");
					int ordersSalePrice = resultSet.getInt("ordersSalePrice");
					int ordersQuantity = resultSet.getInt("ordersQuantity");
					CManagerOrderStautsDTo dto = new CManagerOrderStautsDTo(ordersId, ordersStatus, o_customerId, o_cakeId, o_goodsId, ordersSalePrice, ordersQuantity);
					dtos.add(dto);
					}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return dtos;
}//option list
	public ArrayList<CManagerOrderStautsDTo> orderStautsList2(){
		ArrayList<CManagerOrderStautsDTo> dtos = new ArrayList<CManagerOrderStautsDTo>();
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		
		try { 
				connection = dataSource.getConnection();
				
				String query = "select ordersId,ordersStatus,o_customerId,o_cakeId,o_goodsId,ordersSalePrice,ordersQuantity from orders where ordersStatus =1";
				preparedStatement = connection.prepareStatement(query);
				resultSet = preparedStatement.executeQuery();
					
				while(resultSet.next()) {
					int ordersId = resultSet.getInt("ordersId");
					String ordersStatus = resultSet.getString("ordersStatus");
					String o_customerId = resultSet.getString("o_customerId");
					int o_cakeId = resultSet.getInt("o_cakeId");
					int o_goodsId = resultSet.getInt("o_goodsId");
					int ordersSalePrice = resultSet.getInt("ordersSalePrice");
					int ordersQuantity = resultSet.getInt("ordersQuantity");
					CManagerOrderStautsDTo dto = new CManagerOrderStautsDTo(ordersId, ordersStatus, o_customerId, o_cakeId, o_goodsId, ordersSalePrice, ordersQuantity);
					dtos.add(dto);
					}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return dtos;
}//option list2
	public ArrayList<CManagerOrderStautsDTo> orderStautsList3(){
		ArrayList<CManagerOrderStautsDTo> dtos = new ArrayList<CManagerOrderStautsDTo>();
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		
		try { 
				connection = dataSource.getConnection();
				
				String query = "select ordersId,ordersStatus,o_customerId,o_cakeId,o_goodsId,ordersSalePrice,ordersQuantity from orders where ordersStatus =2";
				preparedStatement = connection.prepareStatement(query);
				resultSet = preparedStatement.executeQuery();
					
				while(resultSet.next()) {
					int ordersId = resultSet.getInt("ordersId");
					String ordersStatus = resultSet.getString("ordersStatus");
					String o_customerId = resultSet.getString("o_customerId");
					int o_cakeId = resultSet.getInt("o_cakeId");
					int o_goodsId = resultSet.getInt("o_goodsId");
					int ordersSalePrice = resultSet.getInt("ordersSalePrice");
					int ordersQuantity = resultSet.getInt("ordersQuantity");
					CManagerOrderStautsDTo dto = new CManagerOrderStautsDTo(ordersId, ordersStatus, o_customerId, o_cakeId, o_goodsId, ordersSalePrice, ordersQuantity);
					dtos.add(dto);
					}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return dtos;
}//option list3
	

}
