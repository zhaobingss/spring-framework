package com.zbss.springframework;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author zbss
 * @date 2021-06-30 09:50:45
 */
public class SpringDebugTests {

	@Test
	public void testXmlApplicationContext() {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("application.xml");
		TestBean bean = ctx.getBean("hello", TestBean.class);
		System.out.println(bean);
		System.out.println(ctx.getDisplayName());
	}

}
