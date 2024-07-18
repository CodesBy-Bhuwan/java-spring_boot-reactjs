package com.codesbybhuwan.EmsBackend.services;

import com.codesbybhuwan.EmsBackend.dto.EmployeeDto;

public interface EmployeeService {

    EmployeeDto createEmployee(EmployeeDto employeeDto);

    EmployeeDto getEmployeeById(Long employeeId);
}
