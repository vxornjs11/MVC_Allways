package com.jsplec.customer.command;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.jsplec.customer.dao.CCustomerCakeOrderDao;
import com.jsplec.customer.dto.CCustomerCakeOrderDto;

public class CCustomerCakeOrderCommand implements CCustomerCommand {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		
		HttpSession session = request.getSession();
		
		String customerId = (String) session.getAttribute("ID");
		String[] ordersId = request.getParameterValues("ordersId");
		
		CCustomerCakeOrderDao dao = new CCustomerCakeOrderDao();

		ArrayList<CCustomerCakeOrderDto> dtos = dao.orderList(customerId, ordersId);
		request.setAttribute("orderList", dtos);
		
		ArrayList<CCustomerCakeOrderDto> dtos2 = dao.customerInfo(customerId);
		request.setAttribute("customerInfo", dtos2);

	}

	@Override
	public boolean execute2(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		return false;
	}

}
