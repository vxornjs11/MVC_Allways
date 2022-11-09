package com.jsplec.customer.command;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsplec.customer.dao.CCustomerCakeListDao;
import com.jsplec.customer.dto.CCustomerCakeListDto;

public class CCustomerCakeListCommand implements CCustomerCommand {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		
		String queryName = request.getParameter("query");
		String content = request.getParameter("content");

		if (queryName == null) {
			queryName = "cakeId";
			content = "";
		}

		CCustomerCakeListDao dao = new CCustomerCakeListDao();
		ArrayList<CCustomerCakeListDto> dtos = dao.cakeList(queryName, content);
		request.setAttribute("cakeList", dtos);
	}

	@Override
	public boolean execute2(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		return false;
	}

}
