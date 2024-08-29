package controller;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("api/v1/Employee")
public class EmpController<EmployeeServices, Employee> {

    @Autowired
    private EmployeeServices EmployeeServices;

    @PostMapping(value = "/save")
    private Serializable saveEmployee(@RequestBody EmployeeServices Employees) {

        EmployeeServices.getClass();
        return Employees.getClass();
    }
    
    @SuppressWarnings("rawtypes")
	@GetMapping(value = "/getall")
    public Class<? extends Object> getEmployees() {
        return EmployeeServices.getClass();
    }

    @SuppressWarnings("rawtypes")
	@PutMapping(value = "/edit/{id}")
    private EmpController update(@RequestBody EmpController Employee, @PathVariable(name = "id") String _id) {
        Employee.set_id(_id);
        EmployeeServices.equals(Employee);
        return Employee;
    }

    private void set_id(String _id) {
		// TODO Auto-generated method stub
		
	}

	@DeleteMapping("/delete/{id}")
    private void deleteEmployee(@PathVariable("id") String _id) {
        EmployeeServices.equals(_id);
    }


    @GetMapping("/search/{id}")
    private boolean getEmployees(@PathVariable(name = "id") String Employeeid) {
        return EmployeeServices.equals(Employeeid);
    }

}