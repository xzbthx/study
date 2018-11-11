package com.java1234.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.java1234.entity.Account;

/**
 * 账户Dao接口
 * @author 12580
 *
 */
public interface AccountDao extends JpaRepository<Account, Integer>{

}
