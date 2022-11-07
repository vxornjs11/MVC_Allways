package com.jsplec.customer.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.jsplec.customer.dao.CCustomerJoinDao;
import com.jsplec.customer.dao.CCustomerLoginDao;

public class CCustomerLoginCommand implements CCustomerCommand {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
	}

	@Override
	public boolean execute2(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		String customerId = request.getParameter("customerId");
		String customerPw = request.getParameter("customerPw");
		
		CCustomerLoginDao dao = new CCustomerLoginDao();
		String name = dao.login(customerId, customerPw);
		
		if(!(name==null)) {
			HttpSession session = request.getSession();
			session.setAttribute("ID", customerId);
			session.setAttribute("NAME", name);
			return true;
		}else {
			request.setAttribute("FAIL", "아이디와 비밀번호를 확인해주세요!");
			return false;
		}

	}

}
