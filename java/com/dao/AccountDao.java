package com.dao;

import com.domain.Account;

import java.util.List;

public interface AccountDao {
    public int addAccount(Account account);
    public int deleteAccount(int i);
    public Account findAccountbyid(int i);
    public List<Account> findAllAccount();
    public int updateAccount(Account account);
}
