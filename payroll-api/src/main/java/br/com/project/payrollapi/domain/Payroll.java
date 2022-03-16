package br.com.project.payrollapi.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Payroll {
	
	private String workerName;
	
	private String description;
	
	
	private Double hourlyPrice;
	

	private Double workedHours;
	
	private Double totalPayment;
	
	

}
