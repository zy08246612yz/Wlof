package com.gc;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * ʹ��log4ʱҪ�Ƚ��������ٽ��ж�ȡ��־�ļ�
 * @author Administrator
 *
 */

public class TimeBook {

	private Logger logger=Logger.getLogger(this.getClass().getName());
	
	public void doAuditing(String name){
		logger.log(Level.INFO, name+"��ʼ�������.....");
		
		logger.log(Level.INFO,name+"������ݽ���.....");
	}
}
