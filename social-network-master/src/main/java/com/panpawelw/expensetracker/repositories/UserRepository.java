package com.panpawelw.expensetracker.repositories;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.panpawelw.expensetracker.entities.User;

@Transactional
public interface UserRepository extends JpaRepository<User, Long>{

    User findByUsername(String Username);

    User findById(long id);
}