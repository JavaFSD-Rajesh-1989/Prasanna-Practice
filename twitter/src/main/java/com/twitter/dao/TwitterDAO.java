package com.twitter.dao;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.twitter.user.TwitterUser;
import com.twitter.utility.DatabaseConnection;

public class TwitterDAO implements TwitterDAOInterface {

	private static TwitterUser tuser[];
	static {
		tuser = new TwitterUser[10];
	}
	
	@Override
	public int createProfileDAO(TwitterUser tu) {
		int i=1;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/revaturechennai", "root", "root");
			
			PreparedStatement ps = con.prepareStatement("insert into TwitterUser values(?,?,?)");
			ps.setString(1, tu.getName());
			ps.setString(2, tu.getPassword());
			ps.setString(3, tu.getEmail());
			
			i=ps.executeUpdate();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return i;
	}

	@Override
	public TwitterUser viewProfileDao(TwitterUser tu) {
		TwitterUser t2=null;
		try {
//			Class.forName("com.mysql.jdbc.Driver");
			
//			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/revaturechennai", "root", "root");
			Connection con=DatabaseConnection.getConnection();

			PreparedStatement ps  = con.prepareStatement("select * from TwitterUser where email=?");
			ps.setString(1, tu.getEmail());
			
			ResultSet res = ps.executeQuery();
			if(res.next()) {
				String name=res.getString(1);
				String password=res.getString(2);
				String email=res.getString(3);
				
			    t2=new TwitterUser();
				t2.setName(name);
				t2.setPassword(password);
				t2.setEmail(email);
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return t2;
	}

	@Override
	public List<TwitterUser> viewallProfileDAO() {
		List<TwitterUser> ll=new ArrayList<TwitterUser>();

		try {
			Connection con=DatabaseConnection.getConnection();
//			PreparedStatement ps = con.prepareStatement("select * from TwitterUser");
//			ResultSet res=ps.executeQuery();

//			Statement ps=con.createStatement();
//			ResultSet res = ps.executeQuery("select * from TwitterUser");
			
			CallableStatement ps=con.prepareCall("{call user}");
			ResultSet res=ps.executeQuery();
			while(res.next()) {
				String n = res.getString(1);
				String p=res.getString(2);
				String e=res.getString(3);
				
				TwitterUser t3=new TwitterUser();
				t3.setName(n);
				t3.setPassword(p);
				t3.setEmail(e);
				
				ll.add(t3);
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return ll;
	}

	@Override
	public TwitterUser searchProfileDAO(TwitterUser tu) {
		TwitterUser t4=null;
		try {
//			Class.forName("com.mysql.jdbc.Driver");
//			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/revaturechennai", "root", "root");
			Connection con=DatabaseConnection.getConnection();

			PreparedStatement ps = con.prepareStatement("select * from TwitterUser where name=?");
			ps.setString(1, tu.getName());
			ResultSet res = ps.executeQuery();
			if(res.next()) {
				String name=res.getString(1);
				String password=res.getString(2);
				String email=res.getString(3);
				
			    t4=new TwitterUser();
				t4.setName(name);
				t4.setPassword(password);
				t4.setEmail(email);
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return t4;
	}

	@Override
	public TwitterUser loginProfileDAO(TwitterUser tu) {
		TwitterUser t5=null;
		try {
//			Class.forName("com.mysql.jdbc.Driver");
//			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/revaturechennai", "root", "root");
			Connection con=DatabaseConnection.getConnection();

			PreparedStatement ps = con.prepareStatement("select * from TwitterUser where email=? and password=?");
			ps.setString(1, tu.getEmail());
			ps.setString(2, tu.getPassword());
			
			ResultSet res = ps.executeQuery();
			if(res.next()) {
				String e=res.getString(1);
				String p=res.getString(2);
				
				t5=new TwitterUser();
				t5.setEmail(e);
				t5.setPassword(p);
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return t5;
	}

	@Override
	public int editProfileDAO(TwitterUser tu) {
		int j=0;
		try {
//			Class.forName("com.mysql.jdbc.Driver");
//			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/revaturechennai", "root", "root");
			Connection con=DatabaseConnection.getConnection();

			PreparedStatement ps=con.prepareStatement("update TwitterUser set password=? where email=?"); 
			ps.setString(1, tu.getPassword());
			ps.setString(2, tu.getEmail());
			
			j=ps.executeUpdate();
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return j;
	}

	@Override
	public int deleteProfileDAO(TwitterUser tu) {
		int d=0;
		try {
//			Class.forName("com.mysql.jdbc.Driver");
//			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/revaturechennai", "root", "root");
			Connection con=DatabaseConnection.getConnection();

			PreparedStatement ps=con.prepareStatement("delete from TwitterUser where email=?");
			ps.setString(1, tu.getEmail());
			
			d=ps.executeUpdate();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return d;
	}

	

}
