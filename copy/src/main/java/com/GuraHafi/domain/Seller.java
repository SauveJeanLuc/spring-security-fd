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
@Table(name = "sellers")
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Seller {

    @Id
    @Column(name = "seller_id")
    private Integer sellerId;

    @Column(name = "version")
    private String firstName;

    @Column(name = "first_name")
    private String secondName;

    @Column(name = "other_name")
    private String otherName;

    @Column(name = "phone_number")
    private String phoneNumber;

    @Column(name = "whatsapp_number")
    private String whatsappNumber;

    @Column(name = "email")
    private String email;

    @Column(name = "tin_number")
    private String tinNumber;

    @Column(name = "id_number")
    private Integer idNumber;

    @Column(name = "imageUrl")
    private String imageUrl;
}
