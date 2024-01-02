package net.javaguides.sms.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class StudentDto {
	private Long id;
	
	@NotEmpty(message="Student First name should not be Empty")
	private String firstName;
	
	@NotEmpty(message="Student Last name should not be Empty")
	private String lastName;
	
	@NotEmpty(message="Student Email should not be Empty")
	@Email
	private String email;

}
