package com.ruoyi.account.service.impl;

import com.ruoyi.account.domain.Bills;
import com.ruoyi.account.mapper.BillsMapper;
import com.ruoyi.account.service.IBillsService;
import com.ruoyi.common.utils.uuid.IdUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class billsServiceImpl implements IBillsService {
    @Autowired
    private BillsMapper billsMapper;

    @Override
    public List<Bills> selectBills(Bills bills) {
        return billsMapper.selectBills(bills);
    }

    @Override
    public Bills selectBillsById(Long billsId) {
        return billsMapper.selectBillsById(billsId);
    }

    @Override
    public int insertBills(Bills bills) {
        String uuid = IdUtils.simpleUUID();
        bills.setUniqueIdentifier(uuid);
        return billsMapper.insertBills(bills);
    }

    @Override
    public int deleteBills(Long[] billsId) {
        return billsMapper.deleteBills(billsId);
    }

    @Override
    public int updateBills(Bills bills) {
        return billsMapper.updateBills(bills);
    }
}
