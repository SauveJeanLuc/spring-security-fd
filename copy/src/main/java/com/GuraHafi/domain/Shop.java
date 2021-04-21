package com.GuraHafi.domain;

import javax.persistence.Column;
import javax.persistence.Id;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Table;

@Getter
@Table(name = "shops")
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Shop {

    @Id
    @Column(name = "shop_id")
    private Integer shopId;

    @Column(name = "shop_name")
    private String shopName;

    @Column(name = "village")
    private String village;

    @Column(name = "cell")
    private String cell;

    @Column(name = "seller_id")
    private String sellerID;

    @Column(name = "category_id")
    private String categoryID;

    @Column(name = "market_id")
    private String marketID;

    @Column(name = "image_url")
    private String imageUrl;

}
