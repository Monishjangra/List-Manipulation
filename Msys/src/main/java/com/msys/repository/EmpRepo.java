package com.msys.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.msys.model.Department;
import com.msys.model.Employee;

@Repository
public interface EmpRepo extends JpaRepository<Employee, Integer> {

    List<Employee> getEmployeeByDepartment(Department department);

    List<Employee> getEmployeeByLocation(String location);

    List<Employee> getEmployeeByDepartmentOrLocation(Department department, String location);

}
