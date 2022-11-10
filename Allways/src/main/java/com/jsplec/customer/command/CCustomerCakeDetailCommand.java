package com.jsplec.customer.command;


import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsplec.customer.dao.CCustomerCakeDetailDao;
import com.jsplec.customer.dao.CCustomerCakeDetailReviewDao;
import com.jsplec.customer.dto.CCustomerCakeDetailReviewDto;
import com.jsplec.customer.dto.CCustomerCakeListDto;

public class CCustomerCakeDetailCommand implements CCustomerCommand {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		
		int cakeId = Integer.parseInt(request.getParameter("cakeId"));
		
		CCustomerCakeDetailDao dao = new CCustomerCakeDetailDao();

		CCustomerCakeListDto dto = dao.cakeDetail(cakeId);
		
		request.setAttribute("cakeInfo", dto);
		
		
		
		
		
		int index = 1; // 시작 페이지 번호
		int rowcount = 10; // 한 페이지에 출력할 리스트 개수
		int pagecount = 10; // 한 페이지에 출력할 페이지 개수
		int pagepage = 0; // ??
		
		
		CCustomerCakeDetailReviewDao dao2 = new CCustomerCakeDetailReviewDao();
		
		
		ArrayList<CCustomerCakeDetailReviewDto> dtos = dao2.detailReview(cakeId);
		int maxpage = (dtos.size() % rowcount) != 0 ? (dtos.size() / rowcount) + 1 : (dtos.size() / rowcount);
		
		if (request.getParameter("index")!=null) {
			index=(int)Float.parseFloat(request.getParameter("index"));
		}
		
		if (index % pagecount == 0) {
			pagepage = index / pagecount - 1;
		} else {
			pagepage = index / pagecount;
		}
		
		request.setAttribute("reviewList", dtos);
		request.setAttribute("listcount", dtos.size());
		
		
		request.setAttribute("maxpage", maxpage);
		request.setAttribute("arrsize", dtos.size());
		request.setAttribute("index", index);
		request.setAttribute("rowcount", rowcount);
		request.setAttribute("pagecount", pagecount);
		request.setAttribute("pagepage", pagepage);
		
	}

	@Override
	public boolean execute2(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		return false;
	}

}
