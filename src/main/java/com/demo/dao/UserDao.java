package com.demo.dao;


import com.demo.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface UserDao extends JpaRepository<User,Integer> , JpaSpecificationExecutor<User> {

}
