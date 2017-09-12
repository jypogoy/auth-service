package com.yogop.authservice;

import com.yogop.authservice.model.Role;
import com.yogop.authservice.model.User;
import com.yogop.authservice.repository.UserRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import java.util.Arrays;

@SpringBootApplication
public class AuthServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(AuthServiceApplication.class, args);
	}

	public void authenticationManager(AuthenticationManagerBuilder builder, UserRepository repo) throws Exception {

		if (repo.count() == 0)
			repo.save(new User("user","user",Arrays.asList(new Role("USER"), new Role("ACTUATOR"))));

		builder.userDetailsService(s -> new CustomerUserdDetails(repo.findByUsername(s)));
	}
}
