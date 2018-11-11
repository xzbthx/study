package com.java1234.controller;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.java1234.service.AccountService;

/**
 * 账户Controller层
 * @author 12580
 *
 */
@RestController
@RequestMapping("/account")
public class AccountController {

	@Resource
	private AccountService accountService;
	
	@RequestMapping("/transfer")
	public String transferAccount() {
		try {
			accountService.transferAccounts(1, 2, 200);
			return "OK";
		}catch(Exception e) {
			return "NO";
		}
	}
}
