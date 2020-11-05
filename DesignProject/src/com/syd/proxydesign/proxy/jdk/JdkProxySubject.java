package com.syd.proxydesign.proxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

import com.syd.proxydesign.service.Subject;


/**
 * JDK动态代理
 * JDK动态代理与静态代理一样，目标类需要实现一个代理接口，它的开发步骤如下：
	1.定义一个java.lang.reflect.InvocationHandler接口的实现类，重写invoke方法
	2.将InvocationHandler对象作为参数传入java.lang.reflect.Proxy的newProxyInstance方法中
	3.通过调用java.lang.reflect.Proxy的newProxyInstance方法获得动态代理对象
	4.通过代理对象调用目标方法
 * @author shenyidong
 *
 */
public class JdkProxySubject implements InvocationHandler{

	private Subject subject;
	
	public JdkProxySubject(Subject subject) {
        this.subject = subject;
    }
	
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("before 前置通知");
        Object result = null;

        try {
            result = method.invoke(subject, args);
        }catch (Exception ex) {
            System.out.println("ex: " + ex.getMessage());
            throw ex;
        }finally {
            System.out.println("after 后置通知");
        }
        return result;
	}

}
