package com.codesbybhuwan.EmsBackend.impl;

import com.codesbybhuwan.EmsBackend.dto.EmployeeDto;
import com.codesbybhuwan.EmsBackend.entities.Employee;
import com.codesbybhuwan.EmsBackend.exception.ResourseNotFoundException;
import com.codesbybhuwan.EmsBackend.mapper.EmployeeMapper;
import com.codesbybhuwan.EmsBackend.repo.EmpolyeeRepo;
import com.codesbybhuwan.EmsBackend.services.EmployeeService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

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

    @Override
    public EmployeeDto getEmployeeById(Long employeeId) {

        Employee employee = employeeRepo.findById(employeeId)
                .orElseThrow(() -> new ResourseNotFoundException("Employee doesn't exist with given Id : " + employeeId));

        return EmployeeMapper.mapToEmployeeDto(employee);
    }

    @Override
    public List<EmployeeDto> getAllEmployee() {

        List<Employee> employees = employeeRepo.findAll();
        return employees.stream().map((employee) -> EmployeeMapper.mapToEmployeeDto(employee))
                .collect(Collectors.toList());
    }

    @Override
    public EmployeeDto updateEmployee(Long employeeId, EmployeeDto updatedEmployee) {

        Employee employee = employeeRepo.findById(employeeId)
                .orElseThrow(() -> new ResourseNotFoundException("Employee doesn't exist with given Id : " + employeeId));
        employee.setFirstName(updatedEmployee.getFirstName());
        employee.setLastName(updatedEmployee.getLastName());
        employee.setEmail(updatedEmployee.getEmil());
        employee.setAddr(updatedEmployee.getAddr());

        Employee updateEmployeeObj = employeeRepo.save(employee);

        return EmployeeMapper.mapToEmployeeDto(updateEmployeeObj);
    }

    @Override
    public void deleteEmployee(Long employeeId) {

        Employee employee = employeeRepo.findById(employeeId)
                .orElseThrow(() -> new ResourseNotFoundException("Employee doesn't exist with given Id : " + employeeId));

        employeeRepo.deleteById(employeeId);

    }
}
