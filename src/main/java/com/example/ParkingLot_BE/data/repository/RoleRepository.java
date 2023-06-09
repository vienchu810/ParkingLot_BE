package com.example.ParkingLot_BE.data.repository;


import com.example.ParkingLot_BE.data.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Role findByCode(String code);
}
