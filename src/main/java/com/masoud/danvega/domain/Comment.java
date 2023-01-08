package com.masoud.danvega.domain;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.masoud.danvega.domain.audit.Auditable;
import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Setter
@RequiredArgsConstructor
@NoArgsConstructor
public class Comment extends Auditable {
    @Id
    @GeneratedValue
    private Long id;
    @NonNull
    private String body;
    @JsonBackReference
    @ManyToOne()
    @JoinColumn(name="LINK_ID")
    @NonNull
    private Link link;
}
