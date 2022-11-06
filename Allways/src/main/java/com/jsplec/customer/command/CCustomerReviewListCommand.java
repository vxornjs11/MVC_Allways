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
		System.out.println("radio : " +radio);
		CCustomerReviewListDao dao = new CCustomerReviewListDao();
		ArrayList<CCustomerReviewListDto> dtos = dao.reviewList(radio);
		
		request.setAttribute("reviewList", dtos);
		request.setAttribute("checkRadio", radio);
		
	}

	@Override
	public boolean execute2(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		return false;
	}

}
