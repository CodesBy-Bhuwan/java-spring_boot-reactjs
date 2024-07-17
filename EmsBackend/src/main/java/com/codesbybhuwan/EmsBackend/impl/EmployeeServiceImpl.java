package com.codesbybhuwan.EmsBackend.impl;

import com.codesbybhuwan.EmsBackend.dto.EmployeeDto;
import com.codesbybhuwan.EmsBackend.entities.Employee;
import com.codesbybhuwan.EmsBackend.mapper.EmployeeMapper;
import com.codesbybhuwan.EmsBackend.repo.EmpolyeeRepo;
import com.codesbybhuwan.EmsBackend.services.EmployeeService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {

    private EmpolyeeRepo employeeRepo;

    @Override
    public EmployeeDto createEmployee(EmployeeDto employeeDto) {

//        First conver EmployeeDto into Employee JpaEntity
        Employee employee = EmployeeMapper.mapToEmployee(employeeDto);
        Employee savedEmp = employeeRepo.save(employee);


        return EmployeeMapper.mapToEmployeeDto(savedEmp);
    }
}
