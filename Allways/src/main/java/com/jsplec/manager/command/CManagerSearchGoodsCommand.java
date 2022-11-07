package com.jsplec.manager.command;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsplec.manager.dao.CManagerGoodsDao;
import com.jsplec.manager.dto.goodsDto;

public class CManagerSearchGoodsCommand implements CManagerCommand {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		String goodsName=request.getParameter("query");
		CManagerGoodsDao dao=new CManagerGoodsDao();
		ArrayList<goodsDto> dtos=dao.searchGoods(goodsName);
		
		request.setAttribute("Dtos", dtos);
		request.setAttribute("Size", dtos.size());
		request.setAttribute("Query", goodsName);
	}

	@Override
	public boolean execute2(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		return false;
	}

}
