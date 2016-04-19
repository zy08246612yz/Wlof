package com.gc;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * 使用log4时要先进行配置再进行读取日志文件
 * @author Administrator
 *
 */

public class TimeBook {

	private Logger logger=Logger.getLogger(this.getClass().getName());
	
	public void doAuditing(String name){
		logger.log(Level.INFO, name+"开始审核数据.....");
		
		logger.log(Level.INFO,name+"审核数据结束.....");
	}
}
