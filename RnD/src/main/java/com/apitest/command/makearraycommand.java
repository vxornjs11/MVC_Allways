package com.apitest.command;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class makearraycommand implements uploadfilecommand {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		ArrayList<String> arr=new ArrayList<String>(); //표에 출력하기 위한 더미 데이터
		int index=1;
		int rowcount=7;
		int pagecount=5;
		int pagepage=0;
		if (request.getParameter("index")!=null) {
			index=(int)Float.parseFloat(request.getParameter("index"));
		}
		
		if (index%pagecount==0) {
			pagepage=index/pagecount-1;
		} else {
			pagepage=index/pagecount;
		}
		
		for (int i=1;i<=150;i++) {
			arr.add(i + "b"); //1부터 100까지 넣기
		}
		
		request.setAttribute("arr", arr);
		request.setAttribute("arrsize", arr.size());
		request.setAttribute("index", index);
		request.setAttribute("rowcount", rowcount);
		request.setAttribute("pagecount", pagecount);
		request.setAttribute("pagepage", pagepage);
	}

}
