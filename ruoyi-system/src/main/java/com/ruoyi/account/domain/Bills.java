package com.ruoyi.account.domain;

import com.ruoyi.common.core.domain.BaseEntity;

public class Bills extends BaseEntity {

    private int id;
    private int inoutType;
    private float amount;
    private String recordTime;
//    private String remark;
    private String uniqueIdentifier;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getInoutType() {
        return inoutType;
    }

    public void setInoutType(int inoutType) {
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

    public String getUniqueIdentifier() {
        return uniqueIdentifier;
    }

    public void setUniqueIdentifier(String uniqueIdentifier) {
        this.uniqueIdentifier = uniqueIdentifier;
    }

    @Override
    public String toString() {
        return "Bills{" +
                "id=" + id +
                ", inoutType=" + inoutType +
                ", amount=" + amount +
                ", recordTime='" + recordTime + '\'' +
                ", uniqueIdentifier='" + uniqueIdentifier + '\'' +
                '}';
    }
}
