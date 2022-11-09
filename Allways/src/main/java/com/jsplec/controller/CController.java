package com.jsplec.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.jsplec.customer.command.CCustomerCakeListCommand;
import com.jsplec.customer.command.CCustomerCommand;
import com.jsplec.customer.command.CCustomerLoginCommand;
import com.jsplec.customer.command.CCustomerOrderListCommand;
import com.jsplec.customer.command.CCustomerReviewListCommand;
import com.jsplec.customer.command.CCustomerWriteReviewCommand;
import com.jsplec.manager.command.CManagerAddCakeCommand;
import com.jsplec.manager.command.CManagerAddGoodsCommand;
import com.jsplec.manager.command.CManagerAddStatusCommand;
import com.jsplec.manager.command.CManagerCheckGoodsNameCommand;
import com.jsplec.manager.command.CManagerCheckGoodsNameCommand2;
import com.jsplec.manager.command.CManagerCheckNameCommand;
import com.jsplec.manager.command.CManagerCheckNameCommand2;
import com.jsplec.manager.command.CManagerCommand;
import com.jsplec.manager.command.CManagerDeleteCakeCommand;
import com.jsplec.manager.command.CManagerDeleteGoodsCommand;
import com.jsplec.manager.command.CManagerLoginCommand;
import com.jsplec.manager.command.CManagerMainCommand;
import com.jsplec.manager.command.CManagerOptionAdd;
import com.jsplec.manager.command.CManagerOptionListCommand;
import com.jsplec.manager.command.CManagerOptionSelect;
import com.jsplec.manager.command.CManagerOptionUpdate;
import com.jsplec.manager.command.CManagerOptionView;
import com.jsplec.manager.command.CManagerOrderStatusCommand;
import com.jsplec.manager.command.CManagerSearchCakeCommand;
import com.jsplec.manager.command.CManagerSearchGoodsCommand;
import com.jsplec.manager.command.CManagerStatusCommand;
import com.jsplec.manager.command.CManagerUpdateCakeCommand;
import com.jsplec.manager.command.CManagerUpdateGoodsCommand;
import com.jsplec.manager.command.CManagerViewCakeDetailCommand;
import com.jsplec.manager.command.CManagerViewCakeListCommand;
import com.jsplec.manager.command.CManagerViewGoodsListCommand;
import com.jsplec.manager.command.CManagerviewGoodsDetailCommand;

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
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		actionDo(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		actionDo(request, response);
	}

	private void actionDo(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		request.setCharacterEncoding("utf-8");
		String viewPage = null;
		CManagerCommand managercommand = null;
		CCustomerCommand customercommand = null;
		HttpSession session = request.getSession();

		String uri = request.getRequestURI();
		String conPath = request.getContextPath();
		String com = uri.substring(conPath.length());

		switch (com) {

//		예진
		case ("/Customer/customerLogin.do"):
			customercommand = new CCustomerLoginCommand();
			if (customercommand.execute2(request, response) == true) {
				viewPage = "customerMain.do";
			} else {
				request.setAttribute("CHECK", customercommand.execute2(request, response));
				viewPage = "customerLogin.jsp";
			}
			break;

		case ("/Customer/customerAbout.do"):
			viewPage = "customerAbout.jsp";
			break;

		case ("/Customer/customerMain.do"):
			viewPage = "customerMain.jsp";
			break;

		case ("/Customer/customerJoin.do"):
			viewPage = "customerJoin.jsp";
			break;

//		한별
		// 리뷰 리스트 출력
		case ("/Customer/customerOrdersReview.do"):
			customercommand = new CCustomerReviewListCommand();
			customercommand.execute(request, response);
			viewPage = "customerOrderReview.jsp";
			break;

		// 리뷰작성 버튼 클릭시 구매 리스트 출력 페이지로
		case ("/Customer/customerOrdersList.do"):
			customercommand = new CCustomerOrderListCommand();
			customercommand.execute(request, response);
			viewPage = "customerOrderList.jsp";
			break;

		// 리뷰 작성하기
		case ("/Customer/customerWriteReview.do"):
			customercommand = new CCustomerWriteReviewCommand();
			customercommand.execute(request, response);
			viewPage = "customerOrdersReview.do";
			break;
//		오수
		case("/Customer/customerCakeList.do"):
			customercommand = new CCustomerCakeListCommand();
			customercommand.execute(request, response);
			viewPage = "customerCakeList.jsp";
			break;
//		유승
		case ("/Manager/managerMain.do"):
			managercommand = new CManagerMainCommand();
			managercommand.execute(request, response);
			viewPage = "managermain.jsp";
			break;

		case ("/Manager/viewCakeList.do"):
			managercommand = new CManagerViewCakeListCommand();
			managercommand.execute(request, response);
			viewPage = "managerviewmenu.jsp";
			break;

		case ("/Manager/searchCake.do"):
			managercommand = new CManagerSearchCakeCommand();
			managercommand.execute(request, response);
			viewPage = "managerviewmenu.jsp";
			break;

		case ("/Manager/checkName.do"):
			managercommand = new CManagerCheckNameCommand();
			managercommand.execute(request, response);
			viewPage = "managercreatecake.jsp";
			break;

		case ("/Manager/cakeDetail.do"):
			managercommand = new CManagerViewCakeDetailCommand();
			managercommand.execute(request, response);
			viewPage = "managermanagecake.jsp";
			break;

		case ("/Manager/addCake.do"):
			managercommand = new CManagerAddCakeCommand();
			managercommand.execute(request, response);
			viewPage = "viewCakeList.do";
			break;

		case ("/Manager/updateCake.do"):
			managercommand = new CManagerUpdateCakeCommand();
			managercommand.execute(request, response);
			viewPage = "viewCakeList.do";
			break;

		case ("/Manager/checkName2.do"):
			managercommand = new CManagerCheckNameCommand2();
			managercommand.execute(request, response);
			viewPage = "managermanagecake.jsp";
			break;

		case ("/Manager/deleteCake.do"):
			managercommand = new CManagerDeleteCakeCommand();
			managercommand.execute(request, response);
			viewPage = "viewCakeList.do";
			break;

		case ("/Manager/viewGoodsList.do"):
			managercommand = new CManagerViewGoodsListCommand();
			managercommand.execute(request, response);
			viewPage = "managerviewgoods.jsp";
			break;

		case ("/Manager/searchGoods.do"):
			managercommand = new CManagerSearchGoodsCommand();
			managercommand.execute(request, response);
			viewPage = "managerviewgoods.jsp";
			break;

		case ("/Manager/addGoods.do"):
			managercommand = new CManagerAddGoodsCommand();
			managercommand.execute(request, response);
			viewPage = "viewGoodsList.do";
			break;

		case ("/Manager/checkGoodsName.do"):
			managercommand = new CManagerCheckGoodsNameCommand();
			managercommand.execute(request, response);
			viewPage = "managercreategoods.jsp";
			break;

		case ("/Manager/checkGoodsName2.do"):
			managercommand = new CManagerCheckGoodsNameCommand2();
			managercommand.execute(request, response);
			viewPage = "managermanagegoods.jsp";
			break;

		case ("/Manager/viewGoodsDetail.do"):
			managercommand = new CManagerviewGoodsDetailCommand();
			managercommand.execute(request, response);
			viewPage = "managermanagegoods.jsp";
			break;

		case ("/Manager/deleteGoods.do"):
			managercommand = new CManagerDeleteGoodsCommand();
			managercommand.execute(request, response);
			viewPage = "viewGoodsList.do";
			break;
			
		case("/Manager/updateGoods.do"):
			managercommand=new CManagerUpdateGoodsCommand();
			managercommand.execute(request, response);
			viewPage="viewGoodsList.do";
			break;

//		태권

		case ("/Manager/managerLoginPage.do"):
			viewPage = "managerLogin.jsp";
			break;

		case ("/Manager/Mlist.do"):
			managercommand = new CManagerOptionListCommand();
			managercommand.execute(request, response);
			viewPage = "managerOptionList.jsp";
			break;

		case ("/Manager/addList.do"):
			viewPage = "ManagerOptionAdd.jsp";
			break;

		case ("/Manager/addOption.do"):
			managercommand = new CManagerOptionAdd();
			managercommand.execute(request, response);
			viewPage = "addList.do";
			break;

		case ("/Manager/return.do"):
			viewPage = "Mlist.do";
			break;

		case ("/Manager/Mselect.do"):
			managercommand = new CManagerOptionSelect();
			managercommand.execute(request, response);
			String Query = request.getParameter("Query");
			if (Query == "") {
				viewPage = "Mlist.do";
			} else {
				viewPage = "managerOptionList.jsp";
			}
			break;

		case ("/Manager/optionId.do"):
			managercommand = new CManagerOptionView();
			managercommand.execute(request, response);
			viewPage = "ManagerOptionAdd.jsp";
			break;

		case ("/Manager/Update.do"):
			managercommand = new CManagerOptionUpdate();
			managercommand.execute(request, response);
			viewPage = "Mlist.do";
			break;

		case ("/Manager/managerLogin.do"):
			managercommand = new CManagerLoginCommand();
			boolean check = managercommand.execute2(request, response);
			if (check == false) {
				request.setAttribute("CHECK", check);
				viewPage = "managerLogin.jsp";
			} else {
				viewPage = "managerMain.do";
			}
			break;

		case ("/Manager/MorderStatus.do"):
			managercommand = new CManagerOrderStatusCommand();
			managercommand.execute(request, response);
			viewPage = "ManagerOrderStatus.jsp";
			break;
		case ("/Manager/Status.do"):
			managercommand = new CManagerStatusCommand();
			managercommand.execute(request, response);
			viewPage = "ManagerAddStatus.jsp";
			break;
		case ("/Manager/ADDR.do"):
			managercommand = new CManagerAddStatusCommand();
			managercommand.execute(request, response);
			viewPage = "MorderStatus.do";
			break;
		}

		RequestDispatcher dispatcher = request.getRequestDispatcher(viewPage);
		dispatcher.forward(request, response);

	}

}
