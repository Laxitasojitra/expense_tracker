package com.panpawelw.expensetracker.services;

import com.panpawelw.expensetracker.entities.User;
import com.panpawelw.expensetracker.repositories.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

  private final UserRepository repository;

  @Autowired
  public UserService(UserRepository repository) {
    this.repository = repository;
  }

  public User findById(long id) {
    return repository.findById(id);
  }

  public User findByUsername(String username) {
    return repository.findByUsername(username);
  }

  public long save(User user) {
    return repository.saveAndFlush(user).getId();
  }
}
