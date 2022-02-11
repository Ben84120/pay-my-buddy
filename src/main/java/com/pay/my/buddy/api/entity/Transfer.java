package com.pay.my.buddy.api.entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "transfer")
@Data
public class Transfer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "id_user_sender")
    private Integer idSender;

    @Column(name = "id_user_receiver")
    private Date id_receiver;

    @Column(name = "amount")
    private BigDecimal amount;

    @Column(name = "date")
    private Date date;
}
