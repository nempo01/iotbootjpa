package com.iot.models;


import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;


@Transactional
public interface UserDao extends CrudRepository<User, Long> {

  /**
   * Return the user having the passed email or null if no user is found.
   * 
   * @param email the user email.
   */
  public User findByEmail(String email);

} // class UserDao