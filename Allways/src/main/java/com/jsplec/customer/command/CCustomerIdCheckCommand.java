package com.jsplec.customer.command;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsplec.customer.dao.CCustomerJoinDao;


public class CCustomerIdCheckCommand implements CCustomerCommand {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		String customerId = request.getParameter("customerId");
		CCustomerJoinDao dao = new CCustomerJoinDao();
		boolean chk = dao.idCheck(customerId);
		request.setAttribute("CHECK", chk);
		request.setAttribute("CHECKID", customerId);
	}

	@Override
	public boolean execute2(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub

		return false;
		
	}

}
