package com.apitest.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class filedao {

	DataSource dataSource;
	
	public filedao() {
		try {
			Context context = new InitialContext();
			dataSource = (DataSource) context.lookup("java:comp/env/jdbc/mvc");
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void uploadaction(String title, String author, String filename) {
		Connection connection = null;
		PreparedStatement ps = null;
		ResultSet rs = null;

		try {
			connection = dataSource.getConnection();

			String query = "insert into fileupload (title, author, filename) values (?, ?, ?)";
			ps = connection.prepareStatement(query);
			ps.setString(1, title);
			ps.setString(2, author);
			ps.setString(3, filename);
			ps.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs!=null) rs.close();
				if(ps!=null)ps.close();
				if (connection!=null) connection.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}
	
	public String searchfile(String title) {
		String filename="";
		Connection connection = null;
		PreparedStatement ps = null;
		ResultSet rs = null;

		try {
			connection = dataSource.getConnection();

			String query = "select filename from fileupload where title=?";
			ps = connection.prepareStatement(query);
			ps.setString(1, title);
			rs = ps.executeQuery();

			if (rs.next()) {
				filename=rs.getString(1);
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs!=null) rs.close();
				if(ps!=null)ps.close();
				if (connection!=null) connection.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		return filename;
	}
}
