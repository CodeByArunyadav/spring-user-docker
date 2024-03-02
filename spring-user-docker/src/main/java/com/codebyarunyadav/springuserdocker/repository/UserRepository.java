package com.codebyarunyadav.springuserdocker.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.codebyarunyadav.springuserdocker.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

}