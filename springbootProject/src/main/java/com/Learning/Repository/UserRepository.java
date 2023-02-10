package com.Learning.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Learning.Entity.Users;

public interface UserRepository extends JpaRepository<Users, Integer> {

}
