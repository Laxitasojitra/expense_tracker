package com.panpawelw.expensetracker.repositories;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.panpawelw.expensetracker.entities.Post;

@Transactional
public interface PostRepository extends JpaRepository<Post,Long>{

    List<Post> findAllByOrderByCreatedDesc();

    List<Post> findAllByUserIdOrderByCreatedDesc(long id);

    Post findById(long id);
}