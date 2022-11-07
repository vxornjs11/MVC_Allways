package com.jsplec.manager.command;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsplec.manager.dao.ManagerCakeDao;
import com.jsplec.manager.dto.cakeListDto;

public class CManagerSearchCakeCommand implements CManagerCommand {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		String cakeName=request.getParameter("query");
		ArrayList<cakeListDto> dtos=new ArrayList<cakeListDto>();
		ManagerCakeDao dao=new ManagerCakeDao();
		if (cakeName==null) {
			dtos=dao.viewCakeList();
		} else {
			dtos=dao.searchCake(cakeName);
		}
		request.setAttribute("Dtos", dtos);
		request.setAttribute("Size", dtos.size());
		request.setAttribute("Query", cakeName);
	}

	@Override
	public boolean execute2(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		return false;
	}

}
