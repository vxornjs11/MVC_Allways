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
		String sort1 = request.getParameter("sort1");
		String sort2 = request.getParameter("sort2");

		if (queryName == null) {
			queryName = "cakeId";
			content = "";
		}
		if(sort1 == null) {
			sort1 = "cakeInitdate";
			sort2 = "desc";
		}

		CCustomerCakeListDao dao = new CCustomerCakeListDao();
		ArrayList<CCustomerCakeListDto> dtos = dao.cakeList(queryName, content, sort1, sort2);
		request.setAttribute("cakeList", dtos);
	}

	@Override
	public boolean execute2(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		return false;
	}

}
