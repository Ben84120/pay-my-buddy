package com.pay.my.buddy.api.entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "transfer")
@Data
public class Transfer {

    @Column(name = "amount")
    private BigDecimal amount;

    @Column(name = "date")
    private Date date;
}
