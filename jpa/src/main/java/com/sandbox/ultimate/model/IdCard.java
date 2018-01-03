package com.sandbox.ultimate.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ID_CARD")
public class IdCard {

    @Id
    @GeneratedValue
    @Column(name = "ID")
    private long key;

    @Column(name = "ID_NUMBER")
    private String idNumber;

    @Column(name = "ISSUE_DATE")
    private Date timestamp;

    public long getKey() {
        return key;
    }

    public void setKey(long key) {
        this.key = key;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("IdCard{");
        sb.append("key=").append(key);
        sb.append(", idNumber='").append(idNumber).append('\'');
        sb.append(", timestamp=").append(timestamp);
        sb.append('}');
        return sb.toString();
    }
}
