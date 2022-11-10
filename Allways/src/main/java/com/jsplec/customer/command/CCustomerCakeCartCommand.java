package com.jsplec.customer.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.jsplec.customer.dao.CCustomerCakeCartDao;

public class CCustomerCakeCartCommand implements CCustomerCommand {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		
		CCustomerCakeCartDao dao = new CCustomerCakeCartDao();
		
		HttpSession session = request.getSession();
		
		String customerId = (String) session.getAttribute("ID");
		
		int cakeId = Integer.parseInt(request.getParameter("cakeId"));
		String cakeName = request.getParameter("cakeName");
		int cakePrice = Integer.parseInt(request.getParameter("cakePrice"));
		int ordersQuantity = Integer.parseInt(request.getParameter("cakeQuantity"));
		
		dao.cartInsert(customerId, cakeId, cakeName, cakePrice, ordersQuantity);

	}

	@Override
	public boolean execute2(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		return false;
	}

}
