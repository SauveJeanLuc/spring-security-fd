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
@Table(name = "shop_categories")
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ShopCategory {

    @Id
    @Column(name = "category_id")
    private Integer categoryId;

    @Column(name = "category_name")
    private String CategoryName;

}
