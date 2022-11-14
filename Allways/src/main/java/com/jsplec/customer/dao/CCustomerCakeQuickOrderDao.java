package com.jsplec.customer.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import com.jsplec.customer.dto.CCustomerCakeDetailReviewDto;
import com.jsplec.customer.dto.CCustomerCakeListDto;
import com.jsplec.customer.dto.CCustomerCakeOptionListDto;
import com.jsplec.customer.dto.CCustomerCakeOrderDto;
import com.jsplec.customer.dto.CCustomerCartListDto;

public class CCustomerCakeQuickOrderDao {

	DataSource dataSource;

	public CCustomerCakeQuickOrderDao() {
		try {
			Context context = new InitialContext();
			dataSource = (DataSource) context.lookup("java:comp/env/jdbc/mvc");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}