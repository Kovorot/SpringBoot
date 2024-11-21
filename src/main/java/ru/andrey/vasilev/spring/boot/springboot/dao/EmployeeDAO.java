package ru.andrey.vasilev.spring.boot.springboot.dao;

import ru.andrey.vasilev.spring.boot.springboot.entity.Employee;

import java.util.List;

public interface EmployeeDAO {

    List<Employee> getAllEmployees();

    void saveEmployee(Employee employee);

    Employee getEmployee(int id);

    void deleteEmployee(int id);
}
