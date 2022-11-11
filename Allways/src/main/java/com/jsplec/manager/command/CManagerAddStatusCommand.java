package com.jsplec.manager.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsplec.manager.dao.CManagerOrderListDao;
import com.jsplec.manager.dto.CManagerOptionListDto;

public class CManagerAddStatusCommand implements CManagerCommand {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
	
		String ordersId = request.getParameter("ordersId");
		String ordersStatus = request.getParameter("ordersStatus");
		String o_customerId = request.getParameter("o_customerId");
		String o_cakeId = request.getParameter("o_cakeId");
		String o_goodsId = request.getParameter("o_goodsId");
		String ordersSalePrice = request.getParameter("ordersSalePrice");
		String ordersQuantity = request.getParameter("ordersQuantity");
		String ad = "제작중";
		String bbb = "제작완료";
		if(ordersStatus.equals(ad)) {
			CManagerOrderListDao dao = new CManagerOrderListDao();
			dao.Addstatus(ordersId, ordersStatus, o_customerId, o_cakeId, o_goodsId, ordersSalePrice, ordersQuantity);
		}else if (ordersStatus.equals(bbb)) {
			CManagerOrderListDao dao = new CManagerOrderListDao();
			dao.Addstatus2(ordersId, ordersStatus, o_customerId, o_cakeId, o_goodsId, ordersSalePrice, ordersQuantity);
		}
		
		
	}

	@Override
	public boolean execute2(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		return false;
	}

}
