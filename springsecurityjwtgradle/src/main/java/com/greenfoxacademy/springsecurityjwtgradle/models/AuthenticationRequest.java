package com.greenfoxacademy.springsecurityjwtgradle.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "users")
public class AuthenticationRequest {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;
  private String userName;
  private String password;

  public AuthenticationRequest() {
  }

  public AuthenticationRequest(String userName, String password) {
    this.userName = userName;
    this.password = password;
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }
}
