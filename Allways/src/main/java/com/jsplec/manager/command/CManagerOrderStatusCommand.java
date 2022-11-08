package com.jsplec.manager.command;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsplec.manager.dao.CManagerOrderListDao;
import com.jsplec.manager.dao.CManagerOrderStausDao;
import com.jsplec.manager.dto.CManagerOptionListDto;
import com.jsplec.manager.dto.CManagerOrderStautsDTo;

public class CManagerOrderStatusCommand implements CManagerCommand {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		CManagerOrderStausDao dao = new CManagerOrderStausDao();
		ArrayList<CManagerOrderStautsDTo> dtos = dao.orderStautsList();
			request.setAttribute("OrdersList", dtos);
			ArrayList<CManagerOrderStautsDTo> dtos2 = dao.orderStautsList2();
			request.setAttribute("OrdersList2", dtos2);
			ArrayList<CManagerOrderStautsDTo> dtos3 = dao.orderStautsList3();
			request.setAttribute("OrdersList3", dtos3);

		
	}

	@Override
	public boolean execute2(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		return false;
	}

}
