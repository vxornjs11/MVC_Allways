package com.jsplec.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.jsplec.customer.command.CCustomerCakeDetailCommand;
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
		case ("/Customer/customerAbout.do"):
			viewPage = "customerAbout.jsp";
			break;

		case ("/Customer/customerMain.do"):
			viewPage = "customerMain.jsp";
			break;

		case ("/Customer/customerJoin.do"):
			viewPage = "customerJoin.jsp";
			break;
			
		case ("/Customer/customerLogin.do"):
			customercommand = new CCustomerLoginCommand();
			boolean check = customercommand.execute2(request, response);
			if (check == true) {
				viewPage = "customerMain.do";
			} else {
				request.setAttribute("CHECK", check);
				viewPage = "customerLogin.jsp";
			}
			break;
			
		case ("/Customer/customerLoginPage.do"):
			viewPage = "customerLogin.jsp";
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
			
		case("/Customer/customerCakeDetail.do"):
			customercommand = new CCustomerCakeDetailCommand();
			customercommand.execute(request, response);
			viewPage = "customerCakeDetail.jsp";
			break;
//		유승
		//메인 화면 출력
		case ("/Manager/managerMain.do"):
			managercommand = new CManagerMainCommand();
			managercommand.execute(request, response);
			viewPage = "managermain.jsp";
			break;

		//케이크 검색
		case ("/Manager/searchCake.do"):
			managercommand = new CManagerSearchCakeCommand();
			managercommand.execute(request, response);
			viewPage = "managerviewmenu.jsp";
			break;

		//케이크 생성 시 이름 중복확인
		case ("/Manager/checkName.do"):
			managercommand = new CManagerCheckNameCommand();
			managercommand.execute(request, response);
			viewPage = "managercreatecake.jsp";
			break;

		//케이크 상세보기
		case ("/Manager/cakeDetail.do"):
			managercommand = new CManagerViewCakeDetailCommand();
			managercommand.execute(request, response);
			viewPage = "managermanagecake.jsp";
			break;

		//케이크 추가
		case ("/Manager/addCake.do"):
			managercommand = new CManagerAddCakeCommand();
			managercommand.execute(request, response);
			viewPage = "viewCakeList.do";
			break;

		//케이크 수정
		case ("/Manager/updateCake.do"):
			managercommand = new CManagerUpdateCakeCommand();
			managercommand.execute(request, response);
			viewPage = "viewCakeList.do";
			break;

		//케이크 수정 시 중복확인
		case ("/Manager/checkName2.do"):
			managercommand = new CManagerCheckNameCommand2();
			managercommand.execute(request, response);
			viewPage = "managermanagecake.jsp";
			break;

		//케이크 삭제
		case ("/Manager/deleteCake.do"):
			managercommand = new CManagerDeleteCakeCommand();
			managercommand.execute(request, response);
			viewPage = "viewCakeList.do";
			break;

		//추가상품 검색
		case ("/Manager/searchGoods.do"):
			managercommand = new CManagerSearchGoodsCommand();
			managercommand.execute(request, response);
			viewPage = "managerviewgoods.jsp";
			break;

		//추가상품 추가
		case ("/Manager/addGoods.do"):
			managercommand = new CManagerAddGoodsCommand();
			managercommand.execute(request, response);
			viewPage = "viewGoodsList.do";
			break;

		//추가상품 생성 시 이름 중복확인
		case ("/Manager/checkGoodsName.do"):
			managercommand = new CManagerCheckGoodsNameCommand();
			managercommand.execute(request, response);
			viewPage = "managercreategoods.jsp";
			break;

		//추가상품 수정 시 이름 중복확인
		case ("/Manager/checkGoodsName2.do"):
			managercommand = new CManagerCheckGoodsNameCommand2();
			managercommand.execute(request, response);
			viewPage = "managermanagegoods.jsp";
			break;

		//추가상품 상세정보
		case ("/Manager/viewGoodsDetail.do"):
			managercommand = new CManagerviewGoodsDetailCommand();
			managercommand.execute(request, response);
			viewPage = "managermanagegoods.jsp";
			break;

		//추가상품 삭제
		case ("/Manager/deleteGoods.do"):
			managercommand = new CManagerDeleteGoodsCommand();
			managercommand.execute(request, response);
			viewPage = "viewGoodsList.do";
			break;
			
		//추가상품 수정
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

		case ("/Manager/managerLogin.do"):
			managercommand = new CManagerLoginCommand();
			boolean check2 = managercommand.execute2(request, response);
			if (check2 == false) {
				request.setAttribute("CHECK", check2);
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
			
		case("/Manager/addOption.do"):
			managercommand = new CManagerOptionAdd();
			managercommand.execute(request, response);
			viewPage = "Mlist.do";
			break;
			// 케이크 옵션 추
		case("/Manager/return.do"):
			viewPage = "Mlist.do";
			// 리스트로 돌아가기
		break;
		case("/Manager/Mselect.do"):
			managercommand = new CManagerOptionSelect();
			managercommand.execute(request, response);
			String Query = request.getParameter("Query");
			if(Query == "") {
				viewPage = "Mlist.do";
			}else {
				viewPage = "managerOptionList.jsp";
			}
			break;
			// 옵션 검색 기능
		case("/Manager/optionId.do"):
			managercommand = new CManagerOptionView();
			managercommand.execute(request, response);
			viewPage = "ManagerOptionUpdate.jsp";
			break;
			// 항목 하나 선택해서 수정 화면 이동
		case("/Manager/Update.do"):
			managercommand = new CManagerOptionUpdate();
			managercommand.execute(request, response);
			viewPage = "Mlist.do";
			break;
			// 수정 버튼 누르면 반영됨
		}

		RequestDispatcher dispatcher = request.getRequestDispatcher(viewPage);
		dispatcher.forward(request, response);

	}

}
