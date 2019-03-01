package com.xz.boot2.repository;

import com.xz.boot2.entity.Authentication;
import org.springframework.data.jpa.repository.JpaRepository;


public interface AuthenticationRep extends JpaRepository<Authentication, Integer> {
    Authentication findByPhoneAndUdate(String phone,String udate);
}
