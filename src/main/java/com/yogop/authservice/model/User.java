package com.yogop.authservice.model;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

/**
 * @author Jeffrey Y. Pogoy
 * @created 12 Sep 2017 5:14 PM
 */
@Entity
@Data
public class User {

    @Id
    @GeneratedValue
    private Long id;
    private String username;
    private String password;
    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private List<Role> roles;

    public User() {
    }

    public User(String username, String password, List<Role> roles) {
        this.username = username;
        this.password = password;
        this.roles = roles;
    }
}
