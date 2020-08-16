package com.example.demo;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
	@RequestMapping(name = "/employee", method = RequestMethod.GET)
public Employee getEmployee(@RequestParam long id) {
	return new Employee(id , "Prem" , "IT");
}
	@RequestMapping(name = "/employee", method = RequestMethod.POST, consumes = "application/json")

public Employee createEmployee(@RequestBody Employee emp) {
	return null;
}
}
