package com.codesbybhuwan.EmsBackend.mapper;

import com.codesbybhuwan.EmsBackend.dto.EmployeeDto;
import com.codesbybhuwan.EmsBackend.entities.Employee;

public class EmployeeMapper {

//    This is map emplyee to employeeDto
    public static EmployeeDto mapToEmployeeDto(Employee employee){
        return new EmployeeDto(
                employee.getId(),
                employee.getFirstName(),
                employee.getLastName(),
                employee.getEmail(),
                employee.getAddr()
        );
    }

//    This is map emplyeeDto to employee
    public static Employee mapToEmployee(EmployeeDto employeeDto){
        return new Employee(
                employeeDto.getId(),
                employeeDto.getFirstName(),
                employeeDto.getLastName(),
                employeeDto.getEmil(),
                employeeDto.getAddr()
        );
    }
}
