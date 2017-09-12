package com.yogop.authservice.repository;

import com.yogop.authservice.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Jeffrey Y. Pogoy
 * @created 12 Sep 2017 5:17 PM
 */
public interface UserRepository extends JpaRepository<User, Long> {

    User findByUsername(String username);

}
