package com.jsplec.customer.command;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsplec.customer.dao.CCustomerReviewListDao;
import com.jsplec.customer.dto.CCustomerReviewListDto;

public class CCustomerReviewListCommand implements CCustomerCommand {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		
		String radio = request.getParameter("radio");
		String searchContent = request.getParameter("searchContent");
		String combo = request.getParameter("combo");
		
		CCustomerReviewListDao dao = new CCustomerReviewListDao();
		ArrayList<CCustomerReviewListDto> dtos = dao.reviewList(radio, searchContent, combo);
		
		int index = 1; // 시작 페이지 번호
		int rowcount = 10; // 한 페이지에 출력할 리스트 개수
		int pagecount = 10; // 한 페이지에 출력할 페이지 개수
		int pagepage = 0; // ??
		
		if (request.getParameter("index")!=null) {
			index=(int)Float.parseFloat(request.getParameter("index"));
		}
		
		if (index % pagecount == 0) {
			pagepage = index / pagecount - 1;
		} else {
			pagepage = index / pagecount;
		}
		
		if(combo == null) {
			combo = "or_customerId"; // 초기값 설정
		}
		if(searchContent == null) {
			searchContent = ""; // 텍스트 필드의 값이 null 일 경우 초기값을 비어있는 값으로 설정
		}
		
		
		request.setAttribute("reviewList", dtos); // dao에서 출력한 리스트
		request.setAttribute("checkRadio", radio); // 라디오 버튼에서 가져온 value값
		request.setAttribute("arrsize", dtos.size()); // 리스트의 개수
		request.setAttribute("index", index); // 페이지 번호
		request.setAttribute("rowcount", rowcount); // 한 페이지에 출력할 리스트 개수
		request.setAttribute("pagecount", pagecount); // 한 페이지에 출력할 페이지 개수
		request.setAttribute("pagepage", pagepage); // ??
		
		
		
	}

	@Override
	public boolean execute2(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		return false;
	}

}
