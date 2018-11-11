package com.java1234.service;

/**
 * 账户Service接口
 * @author 12580
 *
 */
public interface AccountService {

	/**
	 * 从A用户转账到b用户
	 * @param fromUser
	 * @param toUser
	 * @param account
	 */
	public void transferAccounts(int fromUser, int toUser, float account);
}
