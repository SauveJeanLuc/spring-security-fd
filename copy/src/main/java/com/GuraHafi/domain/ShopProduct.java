package com.GuraHafi.domain;

import javax.persistence.Column;
import javax.persistence.Id;
import java.util.Date;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;


import javax.persistence.Entity;
import javax.persistence.Table;

@Getter
@Table(name = "shop_product_id")
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ShopProduct {

    @Id
    @Column(name = "shop_product_id")
    private Integer shopProductId;

    @Column(name = "shop_id")
    private Integer shopId;

    @Column(name = "product_id")
    private Integer productId;

    @Column(name = "price")
    private String price;

    @Column(name = "product_quantity")
    private String productQuantity;

    @Column(name = "image_url")
    private String imageUrl;

    @Column(name = "description")
    private String description;

    @Column(name = "recent_update")
    private Date recentUpdate;

    @Column(name = "latest_update")
    private Date latestUpdate;

    @Column(name = "time_before_update")
    private Integer timeBefore;

    @Column(name = "certainty_percentage")
    private Date certaintyPercentage;

    @Column(name = "rate")
    private Integer rate; //To rate product from 1-10

}
