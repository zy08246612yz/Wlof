package com.Invotation;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class TestMain {
public static void main(String[] args) {
	
	TimeBookInterface book=new TimeBook();
	InvocationHandler handle=new ServiceHandle(book);
	TimeBookInterface s=(TimeBookInterface)Proxy.newProxyInstance(book.getClass().getClassLoader(), 
			book.getClass().getInterfaces(), handle);
	s.doAutiding("zhangsan");
}
}
