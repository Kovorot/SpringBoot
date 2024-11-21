package ru.andrey.vasilev.spring.boot.springboot.service;

import ru.andrey.vasilev.spring.boot.springboot.entity.Employee;

import java.util.List;

public interface EmployeeService {

    List<Employee> getAllEmployees();

    void saveEmployee(Employee employee);

    Employee getEmployee(int id);

    void deleteEmployee(int id);
}
