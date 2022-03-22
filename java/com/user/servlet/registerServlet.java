package com.user.servlet;

import java.io.IOException;

import com.DAO.itemDAOImpl;
import com.DB.DBConnect;
import com.entity.ItemDetails;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet("/register")
public class registerServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
			String name=req.getParameter("fname");
			String email=req.getParameter("email");
			String phno=req.getParameter("phno");
			String password=req.getParameter("password");
			String check=req.getParameter("check");
			
			//System.out.println(name+" "+email+" "+phno+" "+password+" "+check);
			
			ItemDetails us=new ItemDetails();
			us.setName(name);
			us.setemail(email);
			us.setPhno(phno);
			us.setPassword(password);
			
			itemDAOImpl dao=new itemDAOImpl(DBConnect.getConn());
			boolean f=dao.userRegister(us);
			if(f) {
				System.out.println("User Register Sucess...");
			}else {
				System.out.println("Something went wrong");
			}
			
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
