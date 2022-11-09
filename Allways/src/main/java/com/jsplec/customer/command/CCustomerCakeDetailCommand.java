package com.jsplec.customer.command;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsplec.customer.dao.CCustomerCakeDetailDao;
import com.jsplec.customer.dto.CCustomerCakeListDto;

public class CCustomerCakeDetailCommand implements CCustomerCommand {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		
		int cakeId = Integer.parseInt(request.getParameter("cakeId"));
		
		CCustomerCakeDetailDao dao = new CCustomerCakeDetailDao();

		CCustomerCakeListDto dto = dao.cakeDetail(cakeId);
		
		request.setAttribute("cakeInfo", dto);
	}

	@Override
	public boolean execute2(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		return false;
	}

}
