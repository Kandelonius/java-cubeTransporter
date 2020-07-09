package com.lambdashane.webemployee.controllers;

import com.lambdashane.webemployee.models.Employee;
import com.lambdashane.webemployee.repositories.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class EmployeeController
{
    @Autowired
    EmployeeRepository emprepos;

    private List<Employee> findEmployees (List<Employee> myList, CheckEmployee tester)
    {
        List<Employee> tempList = new ArrayList<>();

        for (Employee e : myList)
        {
            if (tester.test(e))
            {
                tempList.add(e);
            }
        }

        return tempList;
    }
    // http://localhost:2019/employees/all

    @GetMapping(value = "/employees/all",
    produces = {"application/json"})
    public ResponseEntity<?> listAllEmployees()
    {
        List<Employee> myList = new ArrayList<>();
        emprepos.findAll().iterator().forEachRemaining(myList::add);

        myList.sort((e1, e2) -> e1.getLname().compareToIgnoreCase(e2.getLname()));
        return new ResponseEntity<>(myList,
            HttpStatus.OK);
    }
    // http://localhost:2019/employees/name/S
    @GetMapping(value = "/employees/name/{letter}",
    produces = "application/json")
    public ResponseEntity<?> listAllByFirstName(@PathVariable char letter)
    {
        List<Employee> myList = new ArrayList<>();
        emprepos.findAll().iterator().forEachRemaining(myList::add);
        List<Employee> rtnList = findEmployees(myList, e -> e.getFname().charAt(0) == letter);

        for(Employee e : rtnList)
        {
            System.out.println(e);
        }
        return new ResponseEntity<>(rtnList, HttpStatus.OK);
    }
}
