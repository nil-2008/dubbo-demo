package com.inspur.service;

/**
 * @author Neo
 * @date 2019/4/29 9:19
 */
public class UserServiceImpl implements UserService {
	@Override
	public String getUserById(int userId) {
		System.out.println("userId="+userId);
		return "userId="+userId;
	}
}
