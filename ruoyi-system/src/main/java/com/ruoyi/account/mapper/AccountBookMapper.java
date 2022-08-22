package com.ruoyi.account.mapper;

import com.ruoyi.account.domain.AccountBook;

import java.util.List;

public interface AccountBookMapper {

    public List<AccountBook> selectAccount(AccountBook accountBook);

    public int saveAccount(AccountBook accountBook);

    public AccountBook selectAccountById(Long accountId);

    public int deleteAccountByIds(Long[] accountIds);

    public int updateAccount(AccountBook accountBook);
}
