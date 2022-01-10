package com.bridgelabz.jdbc;

import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCTransaction {
	public static void main(String[] args) throws SQLException {
		Connection connection = null;
		try {
			connection = new EmployeePayrollRepository().getConnection();
			connection.setAutoCommit(false);
		} catch (SQLException e) {
			System.out.println(e);
		}
		int empId = 0;
		try (Statement statement1 = connection.createStatement()) {
			String sql = String.format("insert into employee (name,gender,phone,address,startDate)",
					"values('%s','%s','%s','%s','%s')", args + "rohini", "F", "8263932442", "pune",
					Date.valueOf("2021-11-01"));
			int rowsAffected = statement1.executeUpdate(sql);
			connection.commit();
			if (rowsAffected == 1) {
				System.out.println("employee Data added");
				System.out.println(statement1.getGeneratedKeys());
				ResultSet resultSet = statement1.getGeneratedKeys();
				if (resultSet.next()) {
					empId = resultSet.getInt(1);
				}
			}
			System.out.println(empId);
		} catch (SQLException e) {
			System.out.println(e);
			connection.rollback();
		}
		
	}

}
