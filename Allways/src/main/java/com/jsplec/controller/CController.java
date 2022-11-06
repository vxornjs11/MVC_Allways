package com.jsplec.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.jsplec.customer.command.CCustomerCommand;
import com.jsplec.customer.command.CCustomerReviewListCommand;
import com.jsplec.manager.command.CManagerCommand;

/**
 * Servlet implementation class controller
 */
@WebServlet("*.do")
public class CController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		actionDo(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		actionDo(request, response);
	}

	private void actionDo(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("utf-8");
		String viewPage = null;
		CManagerCommand managercommand = null;
		CCustomerCommand customercommand = null;
		HttpSession session = request.getSession();
		
		String uri = request.getRequestURI();
		String conPath = request.getContextPath();
		String com = uri.substring(conPath.length());
		
		switch(com) {
		
//		예진
		case("/Customer/customerMain.do"):
		viewPage = "customerMain.jsp";
		break;
		
		case("/Customer/customerLogin.do"):
		viewPage = "customerMain.do";
		break;
		
		case("/Customer/customerJoin.do"):
		viewPage = "customerLogin.jsp";
		break;
		
//		한별
		// 리뷰 리스트 출력
		case("/Customer/customerOrdersReview.do"):
			customercommand = new CCustomerReviewListCommand();
			customercommand.execute(request, response);
			viewPage = "customerOrderReview.jsp";
			break;
//		오수
		
//		유승
		
//		태권
		
		case("/Manager/managerLoginPage.do"):
		viewPage = "managerLogin.jsp";
		break;
		
		case("/Manager/managerLogin.do"):
		viewPage = "managerMain.do";
		break;
		
		case("/Manager/managerMain.do"):
		viewPage = "managerMain.jsp";
		break;
		
		}
		
		RequestDispatcher dispatcher = request.getRequestDispatcher(viewPage);
		dispatcher.forward(request, response);
		
	}
	
}
