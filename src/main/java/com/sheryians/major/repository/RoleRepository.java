package com.sheryians.major.repository;

import com.sheryians.major.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface RoleRepository extends JpaRepository<Role,Integer> {
}
