package com.jsplec.manager.command;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsplec.manager.dao.ManagerCakeDao;
import com.jsplec.manager.dto.cakeListDto;

public class CManagerViewCakeListCommand implements CManagerCommand {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		ManagerCakeDao dao=new ManagerCakeDao();
		ArrayList<cakeListDto> dtos=dao.viewCakeList();
		
		request.setAttribute("Dtos", dtos);
		request.setAttribute("Size", dtos.size());
	}

	@Override
	public boolean execute2(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		return false;
	}

}
