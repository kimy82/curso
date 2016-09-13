package com.atos.curso.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.atos.curso.database.TtConnection;
import com.atos.curso.models.Employee;

/**
 * CRUD Operations to the DB.
 * Create, read, update, delete
 * 
 */
public class AtosEmployeeDAO {

	private TtConnection ttConnection = TtConnection.getInstance();

	public List<Employee> findAll() {
		Statement stmt;
		List<Employee> employees = new ArrayList<>();
		try {
			stmt =  this.ttConnection.getConnection().createStatement();
			ResultSet rs = stmt.executeQuery("select name, surname, address from Employees;");
			while (rs.next()) {
				Employee employee = new Employee();
				employee.setName(rs.getString(1));
				employee.setSurname(rs.getString(2));
				employee.setAddress(rs.getString(3));
				employees.add(employee);
			}
		} catch (SQLException ex) {
			// TODO log exception
			ex.printStackTrace();
		}
		
		return employees;
	}
	
	public void save(Employee employee) {
		//Statement.execute("insert into Employees values (1, 2)");
		try {
			PreparedStatement pIns =
					this.ttConnection.getConnection().prepareStatement("insert into Employees values (seq_employee.nextval,?,?,?)");
			pIns.setString(1, employee.getName());
			pIns.setString(2, employee.getSurname());
			pIns.setString(3, employee.getAddress());
			pIns.executeUpdate();
			
		} catch (SQLException e) {
			// TODO log exception
			e.printStackTrace();
		}
	}
}
