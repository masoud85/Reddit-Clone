package com.masoud.danvega.domain;

import com.masoud.danvega.domain.audit.Auditable;
import lombok.*;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
public class Comment extends Auditable {
    @Id
    @GeneratedValue
    private Long id;
    @NonNull
    private String body;
    @ManyToOne()
    @JoinColumn(name="COMMENT_ID")
    private Link link;
}
