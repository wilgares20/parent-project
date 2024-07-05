package com.userservice.model;

import lombok.Data;

@Data

public class User {

  private Long id;

  private String name;

  private String username;

  private String password;

  private Role role;

  private String email;

  public Long getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public String getUsername() {
    return username;
  }

  public String getPassword() {
    return password;
  }

  public Role getRole() {
    return role;
  }

  public String getEmail() {
    return email;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public void setRole(Role role) {
    this.role = role;
  }

  public void setEmail(String email) {
    this.email = email;
  }
}
