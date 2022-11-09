package com.jsplec.manager.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsplec.manager.dao.CManagerOrderListDao;

public class CManagerOptionUpdate implements CManagerCommand {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		String optionId = request.getParameter("optionId");
		String category = request.getParameter("option");
		String value = request.getParameter("optionName");
		String Price = request.getParameter("optionPrice");
		String cakeoptionImage = request.getParameter("cakeoptionImage");
		System.out.println(Price);
		CManagerOrderListDao dao = new CManagerOrderListDao();
		dao.contentUpdate(category, value,Price,optionId,cakeoptionImage);
	}


	@Override
	public boolean execute2(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		return false;
	}

}
