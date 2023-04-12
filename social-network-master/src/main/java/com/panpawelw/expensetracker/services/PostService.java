package com.panpawelw.expensetracker.services;

import com.panpawelw.expensetracker.entities.Post;
import com.panpawelw.expensetracker.repositories.PostRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostService {

  private final PostRepository repository;

  @Autowired
  public PostService(PostRepository repository) {
    this.repository = repository;
  }

  public Post findById(long id) {
    return repository.findById(id);
  }

  public List<Post> findAll() {
    return repository.findAllByOrderByCreatedDesc();
  }

  public List<Post> findAllByUser(long id) {
    return repository.findAllByUserIdOrderByCreatedDesc(id);
  }

  public long save(Post post) {
    return repository.saveAndFlush(post).getId();
  }
}
