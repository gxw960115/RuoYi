package com.ruoyi.account.service;

import com.ruoyi.account.domain.AccountBook;

import java.util.List;

public interface IAccountBookService {

    public List<AccountBook> selectAccount(AccountBook accountBook);

    public int saveAccount(AccountBook accountBook);

    public AccountBook selectAccountById(Long accountId);

    public int updateAccount(AccountBook accountBook);

    public int deleteAccountByIds(Long[] accountIds);
}
