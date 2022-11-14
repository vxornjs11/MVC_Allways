package com.jsplec.customer.command;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.jsplec.customer.dao.CCustomerOrderListDao;
import com.jsplec.customer.dto.CCustomerOrderListDto;

public class CCustomerOrdersListCommand implements CCustomerCommand {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {

		HttpSession session = request.getSession();
		String customerId = (String)session.getAttribute("ID");
		
		CCustomerOrderListDao dao = new CCustomerOrderListDao();
		ArrayList<CCustomerOrderListDto> dtos = dao.ordersList(customerId);
		
		request.setAttribute("ordersList", dtos);
		
	}

	@Override
	public boolean execute2(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		return false;
	}

}
