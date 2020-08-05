package com.cheng.dao;

import com.cheng.pojo.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

@Repository
public interface IUserDao extends JpaRepository<User, Serializable> {
}
