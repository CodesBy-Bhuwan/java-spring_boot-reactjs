package com.codesbybhuwan.EmsBackend.services;

import com.codesbybhuwan.EmsBackend.dto.EmployeeDto;

import java.util.List;

public interface EmployeeService {

    EmployeeDto createEmployee(EmployeeDto employeeDto);

    EmployeeDto getEmployeeById(Long employeeId);

    List<EmployeeDto> getAllEmployee();
}
