package com.masoud.danvega.domain;

import com.masoud.danvega.domain.audit.Auditable;
import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
public class Link extends Auditable {
    @Id
    @GeneratedValue
    private Long id;
    @NonNull
    private String title;
    @NonNull
    private String url;

    @OneToMany(mappedBy = "link", cascade = CascadeType.ALL)
    private List<Comment> comments;
}
