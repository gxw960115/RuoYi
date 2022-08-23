package com.ruoyi.account.service;

import com.ruoyi.account.domain.Bills;

import java.util.List;

public interface IBillsService {

    List<Bills> selectBills(Bills bills);

    Bills selectBillsById(Long billsId);

    int insertBills(Bills bills);

    int deleteBills(Long[] billsId);

    int updateBills(Bills bills);
}
