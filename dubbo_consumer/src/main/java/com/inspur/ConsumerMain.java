package com.inspur;

import com.inspur.service.UserService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 消费端
 *
 * @author Neo
 * @date 2019/4/29 9:55
 */
public class ConsumerMain {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("consumer.xml");
		UserService sayHello = (UserService) ctx.getBean("userService");
		String s = sayHello.getUserById(1111);
		System.out.println(s);
	}
}
