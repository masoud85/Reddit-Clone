package com.masoud.danvega.domain;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.masoud.danvega.domain.audit.Auditable;
import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@RequiredArgsConstructor
@NoArgsConstructor
public class Link extends Auditable {
    @Id
    @GeneratedValue
    private Long id;
    @NonNull
    private  String title;
    @NonNull
    private String url;

    @JsonManagedReference
    @OneToMany(mappedBy = "link", cascade = CascadeType.ALL)
    private List<Comment> comments = new ArrayList<>();

    public void addComment(Comment comment) {
        comments.add(comment);
    }
}
