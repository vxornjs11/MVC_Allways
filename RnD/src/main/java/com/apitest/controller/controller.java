package com.apitest.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.apitest.command.makearraycommand;
import com.apitest.command.makechartcommand;
import com.apitest.command.showfilecommand;
import com.apitest.command.uploadfile;
import com.apitest.command.uploadfilecommand;

/**
 * Servlet implementation class controller
 */
@WebServlet("*.do")
public class controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public controller() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		actiondo(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		actiondo(request, response);
	}

	private void actiondo(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		String viewPage = null;
		uploadfilecommand command = null;
		
		String uri = request.getRequestURI();
		String conPath = request.getContextPath();
		String com = uri.substring(conPath.length());
		
		switch(com) {
		case ("/fileUpload.do"):
			command=new uploadfile();
			command.execute(request, response);
			viewPage="fileshow.jsp";
			break;
		case("/fileview.do"):
			command=new showfilecommand();
			command.execute(request, response);
			viewPage="fileshowresult.jsp";
			break;
		case("/page.do"):
			command=new makearraycommand();
			command.execute(request, response);
			viewPage="paging.jsp";
			break;
		case("/chart.do"):
			command=new makechartcommand();
			command.execute(request, response);
			viewPage="chart.jsp";
			break;
		}
		
		RequestDispatcher dispatcher = request.getRequestDispatcher(viewPage);
		dispatcher.forward(request, response);
	}
}
