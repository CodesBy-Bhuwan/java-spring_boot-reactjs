package com.codesbybhuwan.EmsBackend.repo;

import com.codesbybhuwan.EmsBackend.entities.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

//<Employee, Long> are from Enity-employee and Long-id's datatype
public interface EmpolyeeRepo extends JpaRepository<Employee, Long> {


}
