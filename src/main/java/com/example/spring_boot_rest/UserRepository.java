package com.example.spring_boot_rest;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserRepository {
    public List<Authorities> getUserAuthorities(String user, String password) {
        List<Authorities> authorities = new ArrayList<>();

        if(user.equals("admin") && password.equals("admin")){
            authorities.add(Authorities.WRITE);
            authorities.add(Authorities.DELETE);
            authorities.add(Authorities.READ);
        } else if (user.equals("user1") && password.equals("111")) {
            authorities.add(Authorities.READ);
        } else if (user.equals("user2") && password.equals("222")) {
            authorities.add(Authorities.WRITE);
        }

        return authorities;
    }
}
