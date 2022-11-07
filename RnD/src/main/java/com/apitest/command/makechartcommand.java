package com.apitest.command;

import java.util.ArrayList;
import java.util.Random;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class makechartcommand implements uploadfilecommand {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		ArrayList<Integer> arr=new ArrayList<Integer>();
		Random rand=new Random();
		
		for (int i=0;i<10;i++) {
			arr.add(rand.nextInt(10));
		}
		
		request.setAttribute("rand", arr.toString());
	}

}
