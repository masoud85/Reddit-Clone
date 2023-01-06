package com.masoud.danvega.domain;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
public class Vote {

    @Id
    @GeneratedValue
    private Long id;

//    private User user;
//    private Vote vote;
//    private Link link;

}
