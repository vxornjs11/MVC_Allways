package com.jsplec.customer.command;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.jsplec.customer.dao.CCustomerCakeOrderDao;
import com.jsplec.customer.dto.CCustomerCakeOrderDto;

public class CCustomerCakeQuickOrderCommand implements CCustomerCommand {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {

		HttpSession session = request.getSession();
		String customerId = (String) session.getAttribute("ID");
		
		int cakeId = Integer.parseInt(request.getParameter("cakeId"));
		int cakePrice = Integer.parseInt(request.getParameter("cakePrice"));
		int ordersQuantity = Integer.parseInt(request.getParameter("ordersQuantity"));
		
		CCustomerCakeOrderDao dao = new CCustomerCakeOrderDao();
		ArrayList<CCustomerCakeOrderDto> dtos = dao.customerInfo(customerId);
		request.setAttribute("customerInfo", dtos);
		
	}

	@Override
	public boolean execute2(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		return false;
	}

}
