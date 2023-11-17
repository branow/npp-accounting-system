package com.branow.nppaccountingsystem.repository;

import com.branow.nppaccountingsystem.model.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department, Integer> {
}
