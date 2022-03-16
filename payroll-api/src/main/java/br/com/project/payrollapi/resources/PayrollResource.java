package br.com.project.payrollapi.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.project.payrollapi.domain.Payroll;
import br.com.project.payrollapi.domain.User;
import br.com.project.payrollapi.feignClients.UserFeign;
import lombok.RequiredArgsConstructor;
@RequiredArgsConstructor
@RestController
@RequestMapping(value = "/api/payments")
public class PayrollResource {
	
	
	@Autowired
	private UserFeign userFeign;
	
	
	
	@GetMapping(value = "/{workerId}")
	public ResponseEntity<Payroll>getPayment(@PathVariable Long workerId,@RequestBody Payroll payment) {
		
		User user=userFeign.findById(workerId).getBody();  //pega o corpo da resposta
		
		return ResponseEntity.ok().body(new  Payroll(user.getNome()
				,payment.getDescription(),user.getHourlyPrice()
				,payment.getWorkedHours(),user.getHourlyPrice()
				* payment.getWorkedHours()));
		
	}

}
