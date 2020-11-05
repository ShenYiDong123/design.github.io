package com.syd.proxydesign.service.impl;

import com.syd.proxydesign.service.Subject;

public class RealSubject implements Subject{

	@Override
	public void request() {
		System.out.println("执行目标对象的request方法......");
	}

	@Override
	public void response() {
		 System.out.println("执行目标对象的response方法......");
	}

	@Override
	public void test() {
		System.out.println("测试方法");
	}

}
