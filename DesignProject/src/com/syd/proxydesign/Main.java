package com.syd.proxydesign;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

import com.syd.proxydesign.proxy.jdk.JdkProxySubject;
import com.syd.proxydesign.proxy.statics.ProxySubject;
import com.syd.proxydesign.service.Subject;
import com.syd.proxydesign.service.impl.RealSubject;


public class Main {
	public static void main(String[] args) {
//		System.out.println("--------静态代理---------");
//		// 目标对象
//		Subject realSubject = new RealSubject();
//		// 代理对象 通过构造器注入目标对象
//		Subject proxySubject = new ProxySubject(realSubject);
//		proxySubject.request();
//		proxySubject.response();
//		System.out.println("--------静态代理---------");
//		System.out.println();
//		System.out.println("-------------------------");

		System.out.println("--------动态代理---------");
		// 获取InvocationHandler对象 在构造方法中注入目标对象
		InvocationHandler handler = new JdkProxySubject(new RealSubject());
		//获取代理对象
		Subject newProxyInstance = (Subject)Proxy.newProxyInstance(Main.class.getClassLoader(),  new Class[]{Subject.class}, handler);
		//获得调用方法
		newProxyInstance.request();
//		newProxyInstance.response();
//		newProxyInstance.test();
		System.out.println("--------动态代理---------");
	}
}
