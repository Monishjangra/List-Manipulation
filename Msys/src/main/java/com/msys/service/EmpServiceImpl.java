package com.msys.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.msys.model.Department;
import com.msys.model.Employee;
import com.msys.repository.EmpRepo;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Service
@Transactional
@RequiredArgsConstructor
@Slf4j
public class EmpServiceImpl implements EmpService {

    @Autowired
    private EmpRepo empRepo;

    @Override
    public Employee create(Employee employee) {
        log.info("Saving new employee: " + employee.getName());
        return empRepo.save(employee);
    }

    @Override
    public Employee get(Integer id) {
        return empRepo.findById(id).get();
    }

    @Override
    public List<Employee> list() {
        log.info("Getting list of employee");
        List<Employee> findAll = empRepo.findAll();
        return findAll;
    }

    @Override
    public List<Employee> selectedData(Department department) {
        log.info("Getting custom list of employee");
        List<Employee> selectedData = empRepo.getEmployeeByDepartment(department);
        return selectedData;
    }

    @Override
    public List<Employee> selectedDataByLocation(String location) {
        log.info("Getting list of employee based on location");
        List<Employee> selectedData = empRepo.getEmployeeByLocation(location);
        return selectedData;
    }

    @Override
    public Employee update(Employee employee) {
        log.info("Updating employee: " + employee.getName());
        return empRepo.save(employee);
    }

    @Override
    public Boolean delete(int id) {
        log.info("deleting employee: " + id);
        empRepo.deleteById(id);
        return true;
    }

}
