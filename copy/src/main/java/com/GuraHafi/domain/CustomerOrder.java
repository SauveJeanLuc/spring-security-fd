package com.GuraHafi.domain;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Getter
@Table(name = "customer_order")
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CustomerOrder {

    @Id
    @Column(name = "order_id")
    private Integer orderId;

    @Column(name = "version")
    private Integer version;

    @Column(name = "customer_id")
    private String customer_id;

    @Column(name = "shop_id")
    private String shop_id;

    @Column(name = "date")
    private Date date;

}
