package com.ruoyi.account.mapper;

import com.ruoyi.account.domain.Bills;

import java.util.List;

public interface BillsMapper {

    List<Bills> selectBills(Bills bills);

    Bills selectBillsById(Long billsId);

    int insertBills(Bills bills);

    int deleteBills(Long[] billsId);

    int updateBills(Bills bills);

}
