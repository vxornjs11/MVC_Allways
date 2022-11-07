package com.jsplec.manager.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class ManagerCakeDao {

	DataSource dataSource;
	
	public ManagerCakeDao() {
		try {
			Context context = new InitialContext();
			dataSource = (DataSource) context.lookup("java:comp/env/jdbc/mvc");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void addCake(String cakeName, int cakePrice, String cakeImage, String cakeDetail) {
		Connection connection = null;
		PreparedStatement ps = null;

		try {
			connection = dataSource.getConnection();

			String query = "insert into cake (cakeName, cakePrice, cakeImage, cakeDetail, cakeInitdate) values (?, ?, ?, ?, now());";
			ps = connection.prepareStatement(query);
			
			ps.setString(1, cakeName);
			ps.setInt(2, cakePrice);
			ps.setString(3, cakeImage);
			ps.setString(4, cakeDetail);
			
			ps.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(ps!=null)ps.close();
				if (connection!=null) connection.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}
}
