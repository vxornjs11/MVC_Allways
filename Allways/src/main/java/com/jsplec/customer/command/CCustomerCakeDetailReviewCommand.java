package com.jsplec.customer.command;

import java.util.ArrayList;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.jsplec.customer.dao.CCustomerCakeDetailReviewDao;
import com.jsplec.customer.dao.CCustomerReviewListDao;
import com.jsplec.customer.dto.CCustomerCakeDetailReviewDto;
import com.jsplec.customer.dto.CCustomerReviewListDto;

public class CCustomerCakeDetailReviewCommand implements CCustomerCommand {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		
		int cakeId = Integer.parseInt(request.getParameter("cakeId"));
		
		int index = 1; // 시작 페이지 번호
		int rowcount = 10; // 한 페이지에 출력할 리스트 개수
		int pagecount = 10; // 한 페이지에 출력할 페이지 개수
		int pagepage = 0; // ??
		
		
		CCustomerCakeDetailReviewDao dao = new CCustomerCakeDetailReviewDao();
		
		ArrayList<CCustomerCakeDetailReviewDto> dtos = new ArrayList<CCustomerCakeDetailReviewDto>();
		
		int maxpage = (dtos.size() % rowcount) != 0 ? (dtos.size() / rowcount) + 1 : (dtos.size() / rowcount);
		dtos = dao.detailReview(cakeId, index, dtos.size());
		
		
		request.setAttribute("reviewList", dtos);
		request.setAttribute("listcount", dtos.size());
		
		
		request.setAttribute("maxpage", maxpage);
		request.setAttribute("arrsize", dtos.size());
		request.setAttribute("index", index);
		request.setAttribute("rowcount", rowcount);
		request.setAttribute("pagecount", pagecount);
		request.setAttribute("pagepage", pagepage);
		
		if (request.getParameter("index")!=null) {
			index=(int)Float.parseFloat(request.getParameter("index"));
		}
		
		if (index % pagecount == 0) {
			pagepage = index / pagecount - 1;
		} else {
			pagepage = index / pagecount;
		}

	}

	@Override
	public boolean execute2(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		return false;
	}

}
