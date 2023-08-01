package com.msys.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.msys.model.Department;

@RestController
@RequestMapping("/department")
@CrossOrigin("*")
public class DepCrl {

    @GetMapping("/all")
    public Department[] getData() {
        Department[] dep = Department.values();
        return dep;
    }
}
