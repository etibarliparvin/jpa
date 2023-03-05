package com.example.jpa;

import com.example.jpa.domain.entity.Post;
import com.example.jpa.domain.entity.PostComment;
import com.example.jpa.domain.repository.PostCommentRepository;
import com.example.jpa.domain.repository.PostRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@SpringBootApplication
@RequiredArgsConstructor
public class JpaApplication implements CommandLineRunner {

    private final PostRepository postRepository;
    private final PostCommentRepository postCommentRepository;

    public static void main(String[] args) {
        SpringApplication.run(JpaApplication.class, args);
    }

    @Override
    @Transactional
    public void run(String... args) throws Exception {
//        PostComment one = new PostComment();
//        one.setReview("review1");
//        PostComment two = new PostComment();
//        two.setReview("review2");
//        PostComment three = new PostComment();
//        three.setReview("review3");
//        List<PostComment> list = List.of(one, two, three);
//
//        Post post = new Post();
//        post.setTitle("First post");
//        post.setComments(list);
//
//        postRepository.save(post);

        System.out.println(postRepository.findByPostId(1L));
    }
}
