package com.zbss.springframework;

import org.springframework.beans.factory.InitializingBean;

/**
 * @author zbss
 * @date 2021-06-30 10:24:03
 */
public class TestBean implements InitializingBean {
	@Override
	public void afterPropertiesSet() throws Exception {

		System.out.println("TestBean inited ...");

	}
}
