package com.ciq.ems.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.ciq.ems.model.Employee;

@Repository
public class EmployeeDaoImpl implements EmployeeDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public void save(Employee employee) {	

		int result = jdbcTemplate.update("insert into employee values(?,?,?)",
				new Object[] { employee.getId(), employee.getName(), employee.getSalary() });

		System.out.println(result);
	}

	@Override
	public void update(Employee employee) {
		String update = "update employee set name=?, salary=? where id=?";
		jdbcTemplate.update(update, new Object[] { employee.getName(), employee.getSalary(), employee.getId() });

	}

	@Override
	public void delete(Integer id) {
		jdbcTemplate.update("delete from employee where id=?", id);
	}

	@Override
	public java.util.List<Employee> getAllEmployees() {
		BeanPropertyRowMapper<Employee> beanMapper = new BeanPropertyRowMapper<>(Employee.class);
		System.out.println("getAllEMps.........." + beanMapper);
		return jdbcTemplate.query("select * from employee", beanMapper);

	}
	
	@Override
	public Employee getById(Integer id) {
		return jdbcTemplate.queryForObject("select * from employee where id=?",new BeanPropertyRowMapper<>(Employee.class), id);
		
		 
	}

}
