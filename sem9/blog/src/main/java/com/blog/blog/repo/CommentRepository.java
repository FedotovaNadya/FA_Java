package com.blog.blog.repo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.blog.blog.models.Comment;

public interface CommentRepository extends CrudRepository <Comment, Long>{
    List<Comment> findByArticleId(Long id);
}
