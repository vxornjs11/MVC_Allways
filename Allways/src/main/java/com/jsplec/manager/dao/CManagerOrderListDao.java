package com.jsplec.manager.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.sql.DataSource;

import com.jsplec.manager.dto.CManagerOptionListDto;
import com.mysql.cj.Session;

public class CManagerOrderListDao {


	DataSource dataSource;

public CManagerOrderListDao() {
	// TODO Auto-generated constructor stub
	try {
			Context context = new InitialContext();
			dataSource = (DataSource) context.lookup("java:comp/env/jdbc/mvc");
	}catch (Exception e) {
		e.printStackTrace();// TODO: handle exception
	}
}


	public ArrayList<CManagerOptionListDto> OptionList(){
		ArrayList<CManagerOptionListDto> dtos = new ArrayList<CManagerOptionListDto>();
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		
		try { 
				connection = dataSource.getConnection();
				
				String query = "select cakeoptionId, cakeoptionCategory,cakeoptionValue,cakeoptionPrice from cakeoption order by cakeoptionCategory DESC";
				preparedStatement = connection.prepareStatement(query);
				resultSet = preparedStatement.executeQuery();
				
				while(resultSet.next()) {
					int cakeoptionId = resultSet.getInt("cakeoptionId");
					String cakeoptionCategory = resultSet.getString("cakeoptionCategory");
					String cakeoptionValue = resultSet.getString("cakeoptionValue");
					String cakeoptionPrice = resultSet.getString("cakeoptionPrice");
					
					CManagerOptionListDto dto = new CManagerOptionListDto(cakeoptionId,cakeoptionCategory,cakeoptionValue,cakeoptionPrice);
					dtos.add(dto);
					}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return dtos;
}
	public void Addoption(String cakeoptionCategory, String cakeoptionValue, String cakeoptionprice) {
			
			Connection connection = null;
			PreparedStatement preparedStatement = null;
			try {
				connection = dataSource.getConnection();
				
				String query = "insert into cakeoption (cakeoptionCategory, cakeoptionValue,cakeoptionprice) values (?, ?, ?)";
				preparedStatement = connection.prepareStatement(query);
				preparedStatement.setString(1, cakeoptionCategory);
				preparedStatement.setString(2, cakeoptionValue);
				preparedStatement.setString(3, cakeoptionprice);

				preparedStatement.executeUpdate();
			} catch(Exception e) {
				e.printStackTrace();
			}finally {
				try {
					if(preparedStatement != null) preparedStatement.close();
					if(connection != null) connection.close();
				} catch(Exception e) {
					e.printStackTrace();
				}
			}
		} // add() --
	

	public ArrayList<CManagerOptionListDto> selectList(String option,String Query ){
		ArrayList<CManagerOptionListDto> dtos = new ArrayList<CManagerOptionListDto>();
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		
		
		try { 
				connection = dataSource.getConnection();
				
				
				String query = "select cakeoptionId, cakeoptionCategory,cakeoptionValue,cakeoptionPrice from cakeoption where " + option + "  Like '%" + Query+ "%' order by cakeoptionCategory DESC";
				preparedStatement = connection.prepareStatement(query);
				resultSet = preparedStatement.executeQuery();
				
				while(resultSet.next()) {
					int cakeoptionId = resultSet.getInt("cakeoptionId");
					String cakeoptionCategory = resultSet.getString("cakeoptionCategory");
					String cakeoptionValue = resultSet.getString("cakeoptionValue");
					String cakeoptionPrice = resultSet.getString("cakeoptionPrice");
					
					CManagerOptionListDto dto = new CManagerOptionListDto(cakeoptionId,cakeoptionCategory,cakeoptionValue,cakeoptionPrice);
					dtos.add(dto);
					}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return dtos;
	}
	
	
	public CManagerOptionListDto optionView(String cakeoptionIdd) {
		CManagerOptionListDto dto = null;
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		
		try {
			connection = dataSource.getConnection();
			String query = "select * from cakeoption where cakeoptionId=?";
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setInt(1, Integer.parseInt(cakeoptionIdd));
			resultSet = preparedStatement.executeQuery();
			
			if(resultSet.next()) {
				int cakeoptionId = resultSet.getInt("cakeoptionId");
				String cakeoptionCategory = resultSet.getString("cakeoptionCategory");
				String cakeoptionValue = resultSet.getString("cakeoptionValue");
				String cakeoptionPrice = resultSet.getString("cakeoptionPrice");
			
			
				
				dto = new CManagerOptionListDto(cakeoptionId, cakeoptionCategory, cakeoptionValue, cakeoptionPrice);
						
				}
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(resultSet != null) resultSet.close();
				if(preparedStatement != null) preparedStatement.close();
				if(connection != null) connection.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		return dto;
		
		
	}// content_view
	public void contentUpdate(String cakeoptionCategory,String cakeoptionValue, String cakeoptionPrice, String cakeoptionId) {
		//write
				Connection connection = null;
				PreparedStatement preparedStatement = null;
			
				
				try {
					connection = dataSource.getConnection();
					
					String query = "update cakeoption set cakeoptionCategory = ?, cakeoptionValue = ? , cakeoptionPrice= ? where cakeoptionId = ?";
					preparedStatement = connection.prepareStatement(query);
					
					preparedStatement.setString(1, cakeoptionCategory);
					preparedStatement.setString(2, cakeoptionValue);
					preparedStatement.setString(3, cakeoptionPrice);
					preparedStatement.setInt(4, Integer.parseInt(cakeoptionId));
					
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
			
				
			}//update
	
	
	
}
