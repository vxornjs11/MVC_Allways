package com.jsplec.manager.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import com.jsplec.manager.dto.cakeListDto;

public class ManagerCakeDao {

	DataSource dataSource;

	public ManagerCakeDao() {
		try {
			Context context = new InitialContext();
			dataSource = (DataSource) context.lookup("java:comp/env/jdbc/mvc");
		} catch (Exception e) {
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
				if (ps != null)
					ps.close();
				if (connection != null)
					connection.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}

	public ArrayList<cakeListDto> viewCakeList() {

		ArrayList<cakeListDto> dtos = new ArrayList<cakeListDto>();

		Connection connection = null;
		PreparedStatement ps = null;
		ResultSet rs = null;

		try {
			connection = dataSource.getConnection();
			String query = "select cakeId, cakeName, cakePrice from cake";

			ps = connection.prepareStatement(query);
			rs = ps.executeQuery();

			while (rs.next()) {
				int wkcakeId = rs.getInt(1);
				String wkcakeName = rs.getString(2);
				int wkcakePrice = rs.getInt(3);

				cakeListDto dto = new cakeListDto(wkcakeId, wkcakeName, wkcakePrice);
				dtos.add(dto);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null)
					rs.close();
				if (ps != null)
					ps.close();
				if (connection != null)
					connection.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}

		return dtos;
	}
	
	public ArrayList<cakeListDto> searchCake(String cakeName){
		ArrayList<cakeListDto> dtos = new ArrayList<cakeListDto>();

		Connection connection = null;
		PreparedStatement ps = null;
		ResultSet rs = null;

		try {
			connection = dataSource.getConnection();
			String query = "select cakeId, cakeName, cakePrice from cake where cakeName like '%" + cakeName + "%';";

			ps = connection.prepareStatement(query);
			rs = ps.executeQuery();

			while (rs.next()) {
				int wkcakeId = rs.getInt(1);
				String wkcakeName = rs.getString(2);
				int wkcakePrice = rs.getInt(3);

				cakeListDto dto = new cakeListDto(wkcakeId, wkcakeName, wkcakePrice);
				dtos.add(dto);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null)
					rs.close();
				if (ps != null)
					ps.close();
				if (connection != null)
					connection.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}

		return dtos;
	}
	
	public boolean checkName(String cakeName) {
		
		boolean check=false;
		Connection connection = null;
		PreparedStatement ps = null;
		ResultSet rs = null;

		try {
			connection = dataSource.getConnection();
			String query = "select count(*) from cake where cakeName='" + cakeName + "';";

			ps = connection.prepareStatement(query);
			rs = ps.executeQuery();

			while (rs.next()) {
				int count=rs.getInt(1);
				
				if (count==0) {
					check=true;
				} else {
					check=false;
				}

			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null)
					rs.close();
				if (ps != null)
					ps.close();
				if (connection != null)
					connection.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		
		return check;
	}
}
