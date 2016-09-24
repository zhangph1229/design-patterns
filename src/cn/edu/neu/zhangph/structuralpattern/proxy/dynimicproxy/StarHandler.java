package cn.edu.neu.zhangph.structuralpattern.proxy.dynimicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class StarHandler implements InvocationHandler{
	
	Star realStar;
	
	
	public StarHandler(Star realStar) {
		super();
		this.realStar = realStar;
	}


	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		Object obj = null;
		System.out.println("��̸");
		System.out.println("����Ʊ");
		if(method.getName().equals("sing")){
			obj = method.invoke(realStar, args);
		}
		System.out.println("��Ǯ");
		return obj;
	}
	
}
