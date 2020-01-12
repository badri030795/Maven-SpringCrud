package com.sample.employee.repository;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.sample.employee.model.*;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
