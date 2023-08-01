package com.msys.service;

import java.util.List;

import com.msys.model.Department;
import com.msys.model.Employee;

public interface EmpService {

    Employee create(Employee employee);

    List<Employee> list();

    List<Employee> selectedData(Department department);

    Employee get(Integer id);

    Employee update(Employee employee);

    Boolean delete(int id);

    List<Employee> selectedDataByLocation(String location);
}
