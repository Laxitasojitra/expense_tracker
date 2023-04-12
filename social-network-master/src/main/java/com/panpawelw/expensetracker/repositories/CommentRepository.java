package com.panpawelw.expensetracker.repositories;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.panpawelw.expensetracker.entities.Comment;

@Transactional
public interface CommentRepository extends JpaRepository<Comment, Long> {

    List<Comment> findAllByPostIdOrderByCreatedDesc(long id);

}