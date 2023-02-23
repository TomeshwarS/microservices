package com.javainuse.controllers;

import java.util.ArrayList;
import java.util.List;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.javainuse.model.Employee;

@RestController
public class TestController {

	@RequestMapping(value = "/employee", method = RequestMethod.GET)
	public Employee firstPage() {

		Employee emp = new Employee();
		emp.setName("emp1");
		emp.setDesignation("manager");
		emp.setEmpId("1");
		emp.setSalary(3000);

		return emp;
	}

	@RequestMapping(value = "/employees", method = RequestMethod.GET)
	public List<Employee> secondPage() {

		Employee emp = new Employee();
		emp.setName("emp1");
		emp.setDesignation("manager");
		emp.setEmpId("1");
		emp.setSalary(3000);

		Employee emp2 = new Employee();
		emp2.setName("emp2");
		emp2.setDesignation("manage-tomeshwar");
		emp2.setEmpId("2");
		emp2.setSalary(4000);

		List<Employee> listEmp = new ArrayList<>();

		listEmp.add(emp);
		listEmp.add(emp2);

		return listEmp;
	}
}