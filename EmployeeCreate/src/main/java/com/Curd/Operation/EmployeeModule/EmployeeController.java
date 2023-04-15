package com.Curd.Operation.EmployeeModule;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.ResourceAccessException;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

//@CrossOrigin("http://localhost:4200")
@CrossOrigin("*")
@RestController
@RequestMapping("/api/v1")
public class EmployeeController {

	@Autowired
	private EmployeesRepository employeeRepository;

	// get All Employee
	@GetMapping("/employees")
	public List<Employee> getAllEmployee() {

		return employeeRepository.findAll();

	}

	// create Employee rest Api

	@PostMapping("/employees")
	public Employee createEmployee(@RequestBody Employee employee) {

		// boolean emailFlag=employeeRepository.existsByEmailid(employee.getEmailid());

		// if(emailFlag) {

		// return employee; }

		return employeeRepository.save(employee);

	}

	// get Employee by Id rest Api
	@GetMapping("/employees/{id}")
	public ResponseEntity<Employee> getEmployeeById(@PathVariable Long id) {

		Employee employee = employeeRepository.findById(id)
				.orElseThrow(() -> new ResourceAccessException("Employees Does Not Exist with id:  " + id));

		return ResponseEntity.ok(employee);

	}

	// Update Employee Rest Api
	@PutMapping("/employees/{id}")
	public ResponseEntity<Employee> updateEmployee(@PathVariable Long id, @RequestBody Employee employeeDetails) {

		Employee employee = employeeRepository.findById(id)
				.orElseThrow(() -> new ResourceAccessException("Employees Does Not Exist with id:  " + id));

		employee.setCircular_No(employeeDetails.getCircular_No());
		employee.setCategory(employeeDetails.getCategory());
		employee.setFileLlanguage(employeeDetails.getFileLlanguage());
		employee.setFile_Discription(employeeDetails.getFile_Discription());
		employee.setDateOfIssued(employeeDetails.getDateOfIssued());
		employee.setIssuedBy(employeeDetails.getIssuedBy());
		employee.setAction(employeeDetails.getIssuedBy());

		Employee updatedEmployee = employeeRepository.save(employee);

		return ResponseEntity.ok(updatedEmployee);
	}

	// Delete MApping RestAypi
	@DeleteMapping("employees/{id}")
	public ResponseEntity<Map<String, Boolean>> deleteEmployee(@PathVariable Long id) {

		Employee employee = employeeRepository.findById(id)
				.orElseThrow(() -> new ResourceAccessException("Employees Does Not Exist with id:  " + id));

		employeeRepository.delete(employee);

		Map<String, Boolean> response = new HashMap<>();

		response.put("deleted", Boolean.TRUE);

		return ResponseEntity.ok(response);
	}

}
