package com.Invotation;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class ServiceHandle implements InvocationHandler{

	private Object s;
	
	public ServiceHandle(Object s) {
		super();
		this.s = s;
	}


	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		
		System.out.println("����ʼ!");
		
		Object result=method.invoke(s, args);
		
		System.out.println("�������!");
		return result;
	}

}
