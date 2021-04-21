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
@Table(name = "customer_verified_in_shop")
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CustomerVerifiedInShop {


    @Id
    @Column(name = "verification_id")
    private Integer verificationId;

    @Column(name = "shop_id")
    private Integer shop_id;

    @Column(name = "customer_id")
    private Integer customer_id;

    @Column(name = "level")
    private Integer level;

}
