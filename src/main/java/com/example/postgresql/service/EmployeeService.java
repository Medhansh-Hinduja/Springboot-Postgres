package com.example.postgresql.service;

import com.example.postgresql.dao.ProductRepository;
import com.example.postgresql.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class EmployeeService {

    private ProductRepository productRepository;

    @Autowired
    public EmployeeService(ProductRepository repo) {
        productRepository = repo;
    }

    public List<Employee> getAllEmployee() {
        return productRepository.findAll();
    }

    public Optional<Employee> getEmployeeById(Long id) {
        return productRepository.findById(id);
    }

    public Employee addEmployee(Employee employee) {
        return productRepository.save(employee);
    }

    public Employee updateEmployee(Employee employee) {
        return productRepository.save(employee);
    }

    public void deleteEmployee(Long id) {
        productRepository.deleteById(id);
    }
}
