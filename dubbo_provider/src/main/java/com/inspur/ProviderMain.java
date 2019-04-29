package com.inspur;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * @author Neo
 * @date 2019/4/29 9:20
 */
public class ProviderMain {
	public static void main(String[] args) throws IOException {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("provider.xml");
		ctx.start();
		System.out.println("dubbo服务provider启动成功！");
		System.in.read();
	}
}
