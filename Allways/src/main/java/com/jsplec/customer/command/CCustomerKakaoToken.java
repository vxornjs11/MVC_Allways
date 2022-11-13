package com.jsplec.customer.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsplec.customer.dao.CCustomerKakaoDao;

public class CCustomerKakaoToken implements CCustomerCommand {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		String code = request.getParameter("code");
//
//		CCustomerKakaoDao dao = new CCustomerKakaoDao();
//		String access_token = dao.getToken(code);
//		KakaoDTO kakao = dao.getKakao(access_token);
//		
//		request.setAttribute("kakao", kakao);
//		
//		dao.unlink(kakao.getId(),access_token);
	}

	@Override
	public boolean execute2(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		return false;
	}

}
