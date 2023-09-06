package com.spring.ex04;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class LazyTest {
	public static void main(String[] args) {
		ApplicationContext context = new FileSystemXmlApplicationContext("lazy.xml");

		// 실제로 해당 인스턴스를 사용하는 순간. 
		context.getBean("secondBean");
		 
		First f1 = new First();
		
	}
}


