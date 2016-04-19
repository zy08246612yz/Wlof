package com.Factory;

import java.util.logging.Level;
import java.util.logging.Logger;

public class LogerMain {

	private TimeBookInterface book;
	private Logger logger=Logger.getLogger(this.getClass().getName());
	
	
	
	public LogerMain(TimeBookInterface book) {
		super();
		this.book = book;
	}



	public void doAutiding(String name){
        logger.log(Level.INFO, name+"开始审核数据.....");
		book.doAutiding(name);
		logger.log(Level.INFO,name+"审核数据结束.....");
	}
}
