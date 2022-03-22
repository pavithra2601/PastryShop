package com.DAO;
 import java.sql.Connection;
import java.sql.PreparedStatement;

import com.entity.ItemDetails;
 public class itemDAOImpl implements itemDAO{
	 private Connection conn;

	public itemDAOImpl(Connection conn) {
		super();
		this.conn = conn;
	}

	@Override
	public boolean userRegister(ItemDetails us) {
		boolean f=false;
		try {
			String sql="insert into new_table(name,email,phno,password)";
			PreparedStatement ps=conn.prepareStatement(sql);
			ps.setString(1, us.getName());
			ps.setString(1, us.getemail());
			ps.setString(1, us.getPhno());
			ps.setString(1, us.getPassword());
			
			int i=ps.executeUpdate();
			if(i==1)
			{
				f=true;
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return f;
	}

	
	 
 }
	

	
	
