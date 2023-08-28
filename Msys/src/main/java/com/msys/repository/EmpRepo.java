package com.msys.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.msys.model.Department;
import com.msys.model.Employee;

public interface EmpRepo extends JpaRepository<Employee, Integer> {

    List<Employee> getEmployeeByDepartment(Department department);

    List<Employee> getEmployeeByLocation(String location);

    List<Employee> getEmployeeByDepartmentAndLocation(Department department, String location);

}
