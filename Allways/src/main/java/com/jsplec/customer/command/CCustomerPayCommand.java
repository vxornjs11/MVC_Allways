package com.jsplec.customer.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.jsplec.customer.dao.CCustomerCakeOrderDao;

public class CCustomerPayCommand implements CCustomerCommand {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		
		HttpSession session = request.getSession();
		
		String customerId = (String) session.getAttribute("ID");
		int cakeId = Integer.parseInt(request.getParameter("cakeId"));
		int cakePrice = Integer.parseInt(request.getParameter("cakePrice"));
		int ordersQuantity = Integer.parseInt(request.getParameter("ordersQuantity"));
		int ordersId = Integer.parseInt(request.getParameter("ordersId"));
		
		
		CCustomerCakeOrderDao dao = new CCustomerCakeOrderDao();
		dao.orderInsert(customerId, cakeId, cakePrice, ordersQuantity, ordersId);
	}

	@Override
	public boolean execute2(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		return false;
	}

}
