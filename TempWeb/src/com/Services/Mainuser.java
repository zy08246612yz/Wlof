package com.Services;

import com.DAO.UserDao;

public class Mainuser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UserDao dao=new UserDao();
        if(dao.findByUsername("zhangyi")!=null){
        	System.out.println("≤È’“µΩ¡À");
        }
	}

}
