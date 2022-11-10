package com.jsplec.customer.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsplec.customer.dao.CCustomerWriteListDao;
import com.jsplec.customer.dto.CCustomerWriteListDto;

public class customerBoardDetailCommand implements CCustomerCommand {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {

		int writeId = Integer.parseInt(request.getParameter("writeId"));
		CCustomerWriteListDao dao = new CCustomerWriteListDao();
		CCustomerWriteListDto dto = dao.boardDetail(writeId);
		
		request.setAttribute("boardDetail", dto);
		
	}

	@Override
	public boolean execute2(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		return false;
	}

}
