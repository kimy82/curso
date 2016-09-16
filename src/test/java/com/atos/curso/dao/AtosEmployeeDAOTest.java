package com.atos.curso.dao;

import org.junit.Test;

import com.atos.curso.exceptions.AtosDAOException;

public class AtosEmployeeDAOTest {

	@Test(expected= AtosDAOException.class)
	public void atosEmployee_ThrowsException_whenEmployeeIsNull(){
		AtosEmployeeDAO atosEmployeeDAO = new AtosEmployeeDAO();
		atosEmployeeDAO.save(null);
	}
}
