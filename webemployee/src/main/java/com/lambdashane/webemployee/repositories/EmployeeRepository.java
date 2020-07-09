package com.lambdashane.webemployee.repositories;

import com.lambdashane.webemployee.models.Employee;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeRepository extends CrudRepository<Employee, Long>
{

}
