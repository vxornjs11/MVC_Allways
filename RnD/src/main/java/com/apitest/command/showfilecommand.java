package com.apitest.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.apitest.dao.filedao;

public class showfilecommand implements uploadfilecommand {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		HttpSession session=request.getSession();
		String title=(String)session.getAttribute("TITLE");
		filedao dao=new filedao();
		
		request.setAttribute("FILE", dao.searchfile(title));
	}

}
