package com.jsplec.manager.command;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsplec.manager.dao.CManagerOrderListDao;
import com.jsplec.manager.dto.CManagerOptionListDto;
import com.mysql.cj.Session;

public class CManagerOptionSelect implements CManagerCommand {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		String option = request.getParameter("option");
		String Query = request.getParameter("Query");
		if(option == null) {
			option = "size";
			Query = "";
		}
		
		System.out.println("이거보이냐");
		CManagerOrderListDao dao = new CManagerOrderListDao();
		ArrayList<CManagerOptionListDto> dtos = dao.selectList(option,Query);
		request.setAttribute("OptionList", dtos);
	}

	@Override
	public boolean execute2(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		return false;
	}

}
