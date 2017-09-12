package com.yogop.authservice.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @author Jeffrey Y. Pogoy
 * @created 12 Sep 2017 5:07 PM
 */
@Entity
@Data
public class Role {

    @Id
    @GeneratedValue
    private Long id;
    private String name;

    public Role() {
    }

    public Role(String name) {
        this.name = name;
    }
}
