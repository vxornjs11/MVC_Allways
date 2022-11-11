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
			
			String query = "select ordersId,ordersStatus,o_customerId,o_cakeId,o_goodsId,ordersSalePrice,ordersQuantity from orders where ordersStatus = '주문접수' and orderDeleteDate is null and orderSoldOutDate is null and ordersMakeDate is null";
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
			
			String query = "select ordersId,ordersStatus,o_customerId,o_cakeId,o_goodsId,ordersSalePrice,ordersQuantity from orders where ordersStatus = '제작중' and orderDeleteDate is null and orderSoldOutDate is null ";
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
			
			String query = "select ordersId,ordersStatus,o_customerId,o_cakeId,o_goodsId,ordersSalePrice,ordersQuantity from orders where ordersStatus = '제작완료' and orderDeleteDate is null ";
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
	
	public void OrderDelete(String ordersId) {
		//write
				Connection connection = null;
				PreparedStatement preparedStatement = null;
			
				
				try {
					connection = dataSource.getConnection();
					
					String query = "update orders set orderDeleteDate = now() where ordersId = ?";
					preparedStatement = connection.prepareStatement(query);
					
				
					preparedStatement.setInt(1, Integer.parseInt(ordersId));
					
					preparedStatement.executeUpdate();
				
				}catch(Exception e) {
					e.printStackTrace();
				}finally {
					try {
						if(preparedStatement != null) preparedStatement.close();
						if(connection != null) connection.close();
					}catch(Exception e) {
						e.printStackTrace();
					}
				}
			
				
			}//delete update
	public void OrderSoldOut(String ordersId) {
		//write
				Connection connection = null;
				PreparedStatement preparedStatement = null;
			
				
				try {
					connection = dataSource.getConnection();
					
					String query = "update orders set orderSoldOutDate = now() where ordersId = ?";
					preparedStatement = connection.prepareStatement(query);
					
				
					preparedStatement.setInt(1, Integer.parseInt(ordersId));
					
					preparedStatement.executeUpdate();
				
				}catch(Exception e) {
					e.printStackTrace();
				}finally {
					try {
						if(preparedStatement != null) preparedStatement.close();
						if(connection != null) connection.close();
					}catch(Exception e) {
						e.printStackTrace();
					}
				}
			
				
			}//SOLDOUT update
	

}
