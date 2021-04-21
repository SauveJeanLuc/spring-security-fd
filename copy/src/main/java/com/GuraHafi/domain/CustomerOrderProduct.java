package com.GuraHafi.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Getter
@Table(name = "customer_order_product")
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CustomerOrderProduct {

    @Id
    @Column(name = "customer_order_product_id")
    private Integer customerOrderProductId;

    @Column(name = "order_id")
    private Integer orderId;

    @Column(name = "customer_id")
    private Integer customerId;

    @Column(name = "quantity")
    private Integer quantity;

    @Column(name = "due_amount")
    private Integer dueAmount;


}
