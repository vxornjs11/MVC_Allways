package com.jsplec.customer.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsplec.customer.dao.CCustomerJoinDao;

public class CCustomerJoinCommand implements CCustomerCommand {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		String customerId = request.getParameter("customerId");
		String customerPw = request.getParameter("customerPw");
		String customerName = request.getParameter("customerName");
		String customerGender = request.getParameter("customerGender");
		String customerPhone = request.getParameter("customerPhone");
		String customerEmail = request.getParameter("customerEmail1") + "@" + request.getParameter("customerEmail2");
		String customerBirthday= request.getParameter("customerBirthday");
		String customerPostcode = request.getParameter("customerPostcode");
		String customerAddress = request.getParameter("customerAddress");
		String customerAddressDetail = request.getParameter("customerAddressDetail");
		
		CCustomerJoinDao dao = new CCustomerJoinDao();
		boolean check = dao.idCheck(customerId);
		dao.insertAction(customerId, customerPw, customerName, customerGender, customerPhone, customerEmail, customerBirthday, customerPostcode, customerAddress, customerAddressDetail);
		
		
		request.setAttribute("CHECK", check);
		request.setAttribute("CUSTOMERID", customerId);
		request.setAttribute("CUSTOMERPW", customerPw);
		request.setAttribute("CUSTOMERNAME", customerName);
		request.setAttribute("CUSTOMERGENDER", customerGender);
		request.setAttribute("CUSTOMERPHONE", customerPhone);
		request.setAttribute("CUSTOMEREMAIL", customerEmail);
		request.setAttribute("CUSTOMERBIRTHDAY", customerBirthday);
		request.setAttribute("CUSTOMERPOSTCODE", customerPostcode);
		request.setAttribute("CUSTOMERADDRESS", customerAddress);
		request.setAttribute("CUSTOMERADDRESSDETAIL", customerAddressDetail);

	}

	@Override
	public boolean execute2(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		return false;
	}

}
