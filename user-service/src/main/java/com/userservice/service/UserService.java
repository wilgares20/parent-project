package com.userservice.service;

import com.userservice.mapper.EntityMapper;
import com.userservice.model.User;
import com.userservice.repository.UserRepository;
import java.util.List;

import com.userservice.repository.entity.UserEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {

  private final UserRepository userRepository;

  private final PasswordEncoder passwordEncoder;

  private final EntityMapper entityMapper;

  public User save(final User user) {
    user.setPassword(this.passwordEncoder.encode(user.getPassword()));
    UserEntity userEntity = this.entityMapper.map(user);
    UserEntity userEntity2 = this.userRepository.save(userEntity);
    User userReturn = this.entityMapper.map(userEntity2);
    return userReturn;
  }

  public User findById(final Long id) {
    return this.entityMapper.map(this.userRepository.findById(id).orElse(null));
  }

  public List<User> findAll() {
    return this.entityMapper.map(this.userRepository.findAll());
  }

  public User findByUsername(final String username) {
    UserEntity user = this.userRepository.findByUsername(username).orElse(null);
    User us = this.entityMapper.map(user);
    return us;
  }
}
