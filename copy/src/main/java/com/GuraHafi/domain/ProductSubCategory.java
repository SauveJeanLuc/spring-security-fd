package com.GuraHafi.domain;

import javax.persistence.Column;
import javax.persistence.Id;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Getter
@Table(name = "product_subCategories")
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ProductSubCategory {

    @Id
    @Column(name = "subCategory_id")
    private Integer subCategoryId;

    @Column(name = "subCategory_name")
    private String subCategoryName;

    @Column(name = "category_id")
    private Integer categoryId;

}
