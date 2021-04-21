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
@Table(name = "markets")
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Market {

    @Id
    @Column(name = "market_id")
    private Integer marketId;

    @Column(name = "cell")
    private String cell;

    @Column(name = "name")
    private String name;

    @Column(name = "village")
    private String village;

}
