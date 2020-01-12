package com.sample.employee.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Optional;

import com.sample.employee.exception.RecordNotFoundException;
import com.sample.employee.model.Employee;
import com.sample.employee.repository.EmployeeRepository;

@Service
public class employeeService {
	@Autowired
	EmployeeRepository empRepository;

	public List<Employee> getAllEmployees() {
		List<Employee> employeeList = empRepository.findAll();
		if (employeeList.size() > 0) {
			return employeeList;
		} else {
			return new ArrayList<Employee>();
		}
	}

	public Employee getEmployeeById(Long id) throws RecordNotFoundException {
		Optional<Employee> employee = empRepository.findById(id);
		if (employee.isPresent()) {
			return employee.get();
		} else {
			throw new RecordNotFoundException("No employee record exist for given id");
		}
	}

	public Employee createOrUpdateEmployee(Employee entity) throws RecordNotFoundException {
		Optional<Employee> employee = empRepository.findById(entity.getId());

		if (employee.isPresent()) {
			Employee newEntity = employee.get();
			newEntity.setDesignation(entity.getDesignation());
			newEntity.setFirstName(entity.getFirstName());
			newEntity.setLastName(entity.getLastName());
			newEntity.setJoinedDate(entity.getJoinedDate());
			newEntity.setSalary(entity.getSalary());

			newEntity = empRepository.save(newEntity);

			return newEntity;
		} else {
			entity = empRepository.save(entity);
			return entity;
		}
	}

	public void deleteEmployeeById(Long id) throws RecordNotFoundException {
		Optional<Employee> employee = empRepository.findById(id);

		if (employee.isPresent()) {
			empRepository.deleteById(id);
		} else {
			throw new RecordNotFoundException("No employee record exist for given id");
		}
	}

}
