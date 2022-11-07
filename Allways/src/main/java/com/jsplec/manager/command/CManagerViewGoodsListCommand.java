package com.jsplec.manager.command;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsplec.manager.dao.CManagerGoodsDao;
import com.jsplec.manager.dto.goodsDto;

public class CManagerViewGoodsListCommand implements CManagerCommand {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		CManagerGoodsDao dao=new CManagerGoodsDao();
		ArrayList<goodsDto> dtos=dao.viewGoodsList();
		
		request.setAttribute("Dtos", dtos);
		request.setAttribute("Size", dtos.size());
	}

	@Override
	public boolean execute2(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		return false;
	}

}
