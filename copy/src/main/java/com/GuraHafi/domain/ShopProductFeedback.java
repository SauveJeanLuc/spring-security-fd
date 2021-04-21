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
@Table(name = "shop_product_feedback")
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ShopProductFeedback {

    @Id
    @Column(name = "feeback_id")
    private Integer feedbackId;

    @Column(name = "shop_product_id")
    private Integer shop_product_id;

    @Column(name = "email")
    private String email;

    @Column(name = "best_quality")
    private Boolean bestQuality;

    @Column(name = "medium_quality")
    private Boolean mediumQuality;

    @Column(name = "low_quality")
    private Boolean lowQuality;

    @Column(name = "not_available")
    private Boolean notAvailable;

}
