package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import repo.Emprepo;

@Service
public class EmpService<Employee> {

    @SuppressWarnings("rawtypes")
	@Autowired
    private Emprepo repo;

    @SuppressWarnings("unchecked")
	public <repo> void saveorUpdate(Employee Employees) {

        repo.save(Employees);
    }

    @SuppressWarnings("unchecked")
	public Iterable<Employee> listAll() {

        return this.repo.findAll();
    }


    @SuppressWarnings("unchecked")
	public void deleteEmployee(String id) {

        repo.deleteById(id);
    }

    @SuppressWarnings("unchecked")
	public Object getEmployeeByID(String Employeeid) {

        return repo.findById(Employeeid).get();
    }
}
