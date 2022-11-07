package com.apitest.command;


import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.apitest.dao.filedao;
import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

public class uploadfile implements uploadfilecommand {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		String location="C:\\Users\\dbtmd\\Desktop\\program\\HTML\\RnD\\src\\main\\webapp";
		filedao dao=new filedao();
		HttpSession session=request.getSession();
		int maxSize = 1024 * 1024 * 1024;
		try {
			MultipartRequest multi = new MultipartRequest(request, location, maxSize, "utf-8", new DefaultFileRenamePolicy());
			String userName = multi.getParameter("user");
			String title = multi.getParameter("title");
			String filesystemName = multi.getFilesystemName("uploadFile");
			session.setAttribute("TITLE", title);
			session.setAttribute("FILE", filesystemName);
			dao.uploadaction(title, userName, filesystemName);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
