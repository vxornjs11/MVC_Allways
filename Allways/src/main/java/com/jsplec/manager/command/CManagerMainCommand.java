package com.jsplec.manager.command;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsplec.manager.dao.CManagerMainDao;
import com.jsplec.manager.dao.CManagerOrdersReviewDao;
import com.jsplec.manager.dto.ordersReviewDto;
import com.jsplec.manager.dto.salesDto;

public class CManagerMainCommand implements CManagerCommand {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		ArrayList<salesDto> dtos=new ArrayList<salesDto>();
		CManagerMainDao dao=new CManagerMainDao();
		ArrayList<ordersReviewDto> dtos2=new ArrayList<ordersReviewDto>();
		CManagerOrdersReviewDao dao2=new CManagerOrdersReviewDao();
		
		dtos=dao.showSales();
		dtos2=dao2.showOrdersReviewOnMain();
		request.setAttribute("SALESDTO", dtos);
		request.setAttribute("REVIEWDTO", dtos2);

	}

	@Override
	public boolean execute2(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		return false;
	}

}
