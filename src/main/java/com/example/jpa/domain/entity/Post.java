package com.example.jpa.domain.entity;

import lombok.Data;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@Table(name = "post")
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "post_id")
    private List<PostComment> comments = new ArrayList<>();

//    public void addComment(PostComment comment) {
//        comments.add(comment);
//        comment.setPost(this);
//    }
//
//    public void removeComment(PostComment comment) {
//        comments.remove(comment);
//        comment.setPost(null);
//    }
}
