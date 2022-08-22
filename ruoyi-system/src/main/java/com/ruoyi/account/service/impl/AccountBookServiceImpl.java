package com.ruoyi.account.service.impl;

import com.ruoyi.account.domain.AccountBook;
import com.ruoyi.account.mapper.AccountBookMapper;
import com.ruoyi.account.service.IAccountBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountBookServiceImpl implements IAccountBookService {
    @Autowired
    private AccountBookMapper accountBookMapper;

    @Override
    public List<AccountBook> selectAccount(AccountBook accountBook) {
        return accountBookMapper.selectAccount(accountBook);
    }

    @Override
    public int saveAccount(AccountBook accountBook) {
        return accountBookMapper.saveAccount(accountBook);
    }

    @Override
    public AccountBook selectAccountById(Long accountId) {
        return accountBookMapper.selectAccountById(accountId);
    }

    @Override
    public int updateAccount(AccountBook accountBook) {
        return accountBookMapper.updateAccount(accountBook);
    }

    @Override
    public int deleteAccountByIds(Long[] accountIds) {
        return accountBookMapper.deleteAccountByIds(accountIds);
    }
}
