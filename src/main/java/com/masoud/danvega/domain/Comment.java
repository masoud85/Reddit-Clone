package com.masoud.danvega.domain;

import lombok.*;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
public class Comment {
    @Id
    @GeneratedValue
    private Long id;
    @NonNull
    private String body;
    @ManyToOne()
    @JoinColumn(name="COMMENT_ID")
    private Link link;
}
