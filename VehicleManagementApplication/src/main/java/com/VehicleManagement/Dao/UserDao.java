package com.VehicleManagement.Dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.VehicleManagement.Dto.User;

public interface UserDao extends JpaRepository<User, Long> {

}
