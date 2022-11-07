package com.jsplec.manager.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.jsplec.manager.dao.CManagerOrderListDao;

public class CManagerOptionAdd implements CManagerCommand {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		String category = request.getParameter("option");
		String value = request.getParameter("optionName");
		String Price = request.getParameter("optionPrice");
		CManagerOrderListDao dao = new CManagerOrderListDao();
		dao.Addoption(category, value,Price);

	}

	@Override
	public boolean execute2(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		return false;
	}

}
