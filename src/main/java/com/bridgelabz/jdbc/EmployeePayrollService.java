package com.bridgelabz.jdbc;

import java.util.Locale;

public class EmployeePayrollService {
	EmployeePayrollRepository employeePayrollRepository = new EmployeePayrollRepository();

	public static void main(String[] args) {
		EmployeePayrollService employeePayrollService = new EmployeePayrollService();
		employeePayrollService.retrieveData();
		employeePayrollService.updateSalary("Terrisa", 3000000.00);
		employeePayrollService.retrieveDataByDate();
		employeePayrollService.findSumGroupByMale();
		employeePayrollService.findSumGroupByFeMale();
		employeePayrollService.findAvgGroupByMale();
		employeePayrollService.findAvgGroupByFeMale();
		employeePayrollService.findMinGroupByMale();
		employeePayrollService.findMinGroupByFeMale();
		employeePayrollService.findMaxGroupByMale();
		employeePayrollService.findMaxGroupByFeMale();
		employeePayrollService.findCountGroupByMale();
		employeePayrollService.findCountGroupByFeMale();
	}

	public void retrieveData() {
		System.out.println(employeePayrollRepository.retrieveData());
	}

	private void updateSalary(String name, double d) {
		employeePayrollRepository.updateSalaryUsingPreparedStatement(name.toLowerCase(Locale.ROOT), d);

	}

	private void retrieveDataByDate() {
		System.out.println(employeePayrollRepository.retrieveDataByDateRange());
	}

	private void findSumGroupByMale() {
		System.out.println(employeePayrollRepository.findSumGroupByMale());
	}

	private void findSumGroupByFeMale() {
		System.out.println(employeePayrollRepository.findSumGroupByFeMale());
	}

	private void findAvgGroupByMale() {
		System.out.println(employeePayrollRepository.findSumGroupByMale());
	}

	private void findAvgGroupByFeMale() {
		System.out.println(employeePayrollRepository.findSumGroupByFeMale());
	}

	private void findMinGroupByMale() {
		System.out.println(employeePayrollRepository.findSumGroupByMale());
	}

	private void findMinGroupByFeMale() {
		System.out.println(employeePayrollRepository.findSumGroupByFeMale());
	}

	private void findMaxGroupByMale() {
		System.out.println(employeePayrollRepository.findSumGroupByMale());
	}

	private void findMaxGroupByFeMale() {
		System.out.println(employeePayrollRepository.findSumGroupByFeMale());
	}

	private void findCountGroupByMale() {
		System.out.println(employeePayrollRepository.findSumGroupByMale());
	}

	private void findCountGroupByFeMale() {
		System.out.println(employeePayrollRepository.findSumGroupByFeMale());
	}
}