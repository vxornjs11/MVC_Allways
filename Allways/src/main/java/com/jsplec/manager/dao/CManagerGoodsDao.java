package com.jsplec.manager.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import com.jsplec.manager.dto.cakeListDto;
import com.jsplec.manager.dto.goodsDto;

public class CManagerGoodsDao {

	DataSource dataSource;

	public CManagerGoodsDao() {
		try {
			Context context = new InitialContext();
			dataSource = (DataSource) context.lookup("java:comp/env/jdbc/mvc");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public ArrayList<goodsDto> viewGoodsList() {
		ArrayList<goodsDto> dtos = new ArrayList<goodsDto>();

		Connection connection = null;
		PreparedStatement ps = null;
		ResultSet rs = null;

		try {
			connection = dataSource.getConnection();
			String query = "select goodsId, goodsName, goodsCategory, goodsPrice from goods ";
			String query2 = "where goodsDeletedate is null";

			ps = connection.prepareStatement(query + query2);
			rs = ps.executeQuery();

			while (rs.next()) {
				int wkgoodsId = rs.getInt(1);
				String wkgoodsName = rs.getString(2);
				String wkgoodsCategory = rs.getString(3);
				int wkgoodsPrice = rs.getInt(4);

				goodsDto dto = new goodsDto(wkgoodsId, wkgoodsName, wkgoodsCategory, wkgoodsPrice);
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

	public ArrayList<goodsDto> searchGoods(String goodsName) {
		ArrayList<goodsDto> dtos = new ArrayList<goodsDto>();

		Connection connection = null;
		PreparedStatement ps = null;
		ResultSet rs = null;

		try {
			connection = dataSource.getConnection();
			String query = "select goodsId, goodsName, goodsCategory, goodsPrice from goods ";
			String query2 = "where goodsDeletedate is null and goodsName like '%" + goodsName + "%';";

			ps = connection.prepareStatement(query + query2);
			rs = ps.executeQuery();

			while (rs.next()) {
				int wkgoodsId = rs.getInt(1);
				String wkgoodsName = rs.getString(2);
				String wkgoodsCategory = rs.getString(3);
				int wkgoodsPrice = rs.getInt(4);

				goodsDto dto = new goodsDto(wkgoodsId, wkgoodsName, wkgoodsCategory, wkgoodsPrice);
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

	public void addGoods(String goodsName, String goodsCategory, int goodsPrice, String goodsDetail,
			String goodsImage) {
		Connection connection = null;
		PreparedStatement ps = null;

		try {
			connection = dataSource.getConnection();

			String query = "insert into goods (goodsName, goodsCategory, goodsPrice, goodsDetail, goodsImage, goodsInitdate)";
			String query2 = " values (?, ?, ?, ?, ?, now());";
			ps = connection.prepareStatement(query + query2);

			ps.setString(1, goodsName);
			ps.setString(2, goodsCategory);
			ps.setInt(3, goodsPrice);
			ps.setString(4, goodsDetail);
			ps.setString(5, goodsImage);

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
	
	public boolean checkName(String goodsName) {
		boolean check=false;
		
		PreparedStatement ps = null;
		ResultSet rs = null;
		Connection connection = null;

		try {
			connection = dataSource.getConnection();
			String query = "select count(*) from goods where goodsName='" + goodsName + "';";

			ps = connection.prepareStatement(query);
			rs = ps.executeQuery();

			while (rs.next()) {
				int count = rs.getInt(1);

				if (count == 0) {
					check = true;
				} else {
					check = false;
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
