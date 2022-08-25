package com.ruoyi.account.domain;

import com.ruoyi.common.core.domain.BaseEntity;

public class AccountBook extends BaseEntity {

    private static final long serialVersionUID = 1L;

    /*主键id*/
    private int id;
    /*收支类型*/
    private String inoutType;
    /*金额*/
    private float amount;
    /*记录时间*/
    private String recordTime;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getInoutType() {
        return inoutType;
    }

    public void setInoutType(String inoutType) {
        this.inoutType = inoutType;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    public String getRecordTime() {
        return recordTime;
    }

    public void setRecordTime(String recordTime) {
        this.recordTime = recordTime;
    }

    @Override
    public String toString() {
        return "AccountBook{" +
                "id=" + id +
                ", inoutType=" + inoutType +
                ", amount=" + amount +
                ", recordTime='" + recordTime + '\'' +
                '}';
    }
}
