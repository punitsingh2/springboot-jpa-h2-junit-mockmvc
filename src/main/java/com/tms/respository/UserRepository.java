package com.tms.respository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tms.model.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
