package com.msys.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.msys.model.Department;
import com.msys.model.Employee;
import com.msys.model.Response;
import com.msys.service.EmpService;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/employee")
@RequiredArgsConstructor
@CrossOrigin("*")
public class EmpCrl {

        @Autowired
        private EmpService empService;

        @GetMapping("/list")
        public ResponseEntity<Response> getAllEmployee() {
                return ResponseEntity.ok(
                                Response.builder()
                                                .data(Map.of("emp", empService.list()))
                                                .message("employee recieved")
                                                .status(HttpStatus.OK)
                                                .build());
        }

        @GetMapping("/listBySelection/{selected}")
        public ResponseEntity<Response> getAllEmployee(@PathVariable Department selected) {
                return ResponseEntity.ok(
                                Response.builder()
                                                .data(Map.of("emp", empService.selectedData(selected)))
                                                .message("employee recieved")
                                                .status(HttpStatus.OK)
                                                .build());
        }

        @GetMapping("/listByLocation/{location}")
        public ResponseEntity<Response> getAllEmployee(@PathVariable String location) {
                return ResponseEntity.ok(
                                Response.builder()
                                                .data(Map.of("emp", empService.selectedDataByLocation(location)))
                                                .message("employee recieved")
                                                .status(HttpStatus.OK)
                                                .build());
        }

        @PostMapping("/save")
        public ResponseEntity<Response> saveEmployee(@RequestBody @Valid Employee employee) {

                return ResponseEntity.ok(
                                Response.builder()
                                                .data(Map.of("emp", empService.create(employee)))
                                                .message("employee created")
                                                .status(HttpStatus.CREATED)
                                                .build());
        }

        @GetMapping("/get/{id}")
        public ResponseEntity<Response> getEmployee(@PathVariable Integer id) {
                return ResponseEntity.ok(
                                Response.builder()
                                                .data(Map.of("emp", empService.get(id)))
                                                .message("employee recieved")
                                                .status(HttpStatus.OK)
                                                .build());
        }

        @DeleteMapping("/delete/{id}")
        public ResponseEntity<Response> deleteEmployee(@PathVariable Integer id) {
                return ResponseEntity.ok(
                                Response.builder()
                                                .data(Map.of("delete", empService.delete(id)))
                                                .message("employee deleted")
                                                .status(HttpStatus.OK)
                                                .build());
        }

        @PutMapping("/delete/{id}")
        public ResponseEntity<Response> updateEmployee(@PathVariable Integer id, @RequestBody Employee employee) {
                return ResponseEntity.ok(
                                Response.builder()
                                                .data(Map.of("emp", empService.update(employee)))
                                                .message("employee updated")
                                                .status(HttpStatus.OK)
                                                .build());
        }
}
