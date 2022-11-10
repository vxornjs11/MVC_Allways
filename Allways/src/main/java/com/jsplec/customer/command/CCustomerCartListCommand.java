package com.jsplec.customer.command;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.jsplec.customer.dao.CCustomerCakeListDao;
import com.jsplec.customer.dao.CCustomerCartListDao;
import com.jsplec.customer.dto.CCustomerCakeListDto;
import com.jsplec.customer.dto.CCustomerCartListDto;

public class CCustomerCartListCommand implements CCustomerCommand {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		
		HttpSession session = request.getSession();
		String customerId = (String) session.getAttribute("ID");

		CCustomerCartListDao dao = new CCustomerCartListDao();
		ArrayList<CCustomerCartListDto> dtos = dao.cartList(customerId);
		
		request.setAttribute("cartList", dtos);

	}

	@Override
	public boolean execute2(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		return false;
	}

}
