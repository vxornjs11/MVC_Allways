package com.jsplec.manager.command;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.jsplec.manager.dao.CManagerOrderListDao;
import com.jsplec.manager.dto.CManagerOptionListDto;
public class CManagerOptionListCommand implements CManagerCommand {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
			
		
		
			CManagerOrderListDao dao = new CManagerOrderListDao();
			ArrayList<CManagerOptionListDto> dtos = dao.OptionList();
			request.setAttribute("OptionList", dtos);
			
		
	}

	@Override
	public boolean execute2(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		return false;
	}

}
