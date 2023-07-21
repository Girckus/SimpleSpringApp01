package example.SpringCore.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.ConversionService;
import org.springframework.stereotype.Controller;

import example.SpringCore.beans.impl.Employee;

@Controller("employeeService")
public class EmployeeService {

	@Autowired
	private ConversionService conversionService;

	public Employee getEmployee(String employee) {
		return conversionService.convert(employee, Employee.class);
	}
	
}