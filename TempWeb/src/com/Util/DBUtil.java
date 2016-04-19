package com.Util;

import java.sql.Connection;
import java.sql.SQLException;

import org.apache.commons.dbcp.BasicDataSource;


public class DBUtil {
	private static BasicDataSource ds;
    static{
    	ds=new BasicDataSource();
    	XMLRead.Reader("");
    	ds.setDriverClassName(XMLRead.Config.get("ClassName"));
    	ds.setUrl(XMLRead.Config.get("ConnectString"));
    	ds.setUsername(XMLRead.Config.get("UserName"));
    	ds.setPassword(XMLRead.Config.get("PassWord"));
    	ds.setMaxActive(Integer.parseInt(XMLRead.Config.get("MaxActive")));
    }
    /**
     * 连接数据库
     * @return
     */
    public static Connection Connect()  throws Exception{
    	Connection conn=null;
    	try {
			conn=ds.getConnection();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	return conn;
    }
    /**
     * 关闭数据库
     * @param conn
     */
    public static void Close(Connection conn){
    	try {
    		if(conn!=null){
    			conn.close();
    		}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
}
