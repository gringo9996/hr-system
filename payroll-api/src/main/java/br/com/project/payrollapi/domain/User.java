package br.com.project.payrollapi.domain;



import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@AllArgsConstructor
@NoArgsConstructor


@Data
public class User {
	

	private Long id;
	
	private String nome;
	
	private String email;
	
	private String password;
	
	private Double hourlyPrice;
	

}
