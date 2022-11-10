package com.jsplec.customer.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CCustomerCakeCartCommand implements CCustomerCommand {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		int[] radios = { Integer.parseInt(request.getParameter("shape")),
				Integer.parseInt(request.getParameter("size")), Integer.parseInt(request.getParameter("flavor")),
				Integer.parseInt(request.getParameter("icingcolor")), Integer.parseInt(request.getParameter("bordorcolor")),
				Integer.parseInt(request.getParameter("letteringcolor")), Integer.parseInt(request.getParameter("lettering")) };

	}

	@Override
	public boolean execute2(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		return false;
	}

}
