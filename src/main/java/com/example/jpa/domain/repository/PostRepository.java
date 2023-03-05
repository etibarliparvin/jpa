package com.example.jpa.domain.repository;

import com.example.jpa.domain.entity.Post;
import com.example.jpa.domain.entity.PostComment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface PostRepository extends JpaRepository<Post, Long> {

    @Query(name = "select * from post_comment pc where pc.post_id = :id", nativeQuery = true)
    List<PostComment> findByPostId(Long id);

}
