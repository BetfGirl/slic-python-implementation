package model;

import java.lang.reflect.Method;

import org.aopalliance.intercept.MethodInvocation;
import org.springframework.aop.AfterReturningAdvice;
import org.springframework.aop.MethodBeforeAdvice;
import org.springframework.aop.ThrowsAdvice;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

public class myaspect implements MethodBeforeAdvice,AfterReturningAdvice,MethodInterceptor,ThrowsAdvice  {

	public Object intercept(Object arg0, Method arg1, Object[] arg2, MethodProxy arg3) throws Throwable {
		System.out.println("֮ǰִ�С�������");
		return null;
	}

	public Object invoke(MethodInvocation invocation) throws Throwable {
		System.out.println("����ǰ");
		Object o= invocation.proceed();
		System.out.println("���ƺ�");
		return o;
	}
	
	public void before(Method arg0, Object[] arg1, Object arg2) throws Throwable {
		System.out.println("֮ǰִ�С�������");
	}
	
	 public void afterThrowing(Method method, Object[] args, Object target, Exception ex) {
		 System.out.println("������");
	 }

	public void afterReturning(Object arg0, Method arg1, Object[] arg2, Object arg3) throws Throwable {
		System.out.println("֮��ִ�С�������");
		
	}

}
