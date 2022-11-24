package telran.java2022.person.dto;

import java.time.LocalDate;

import javax.persistence.Embedded;

import lombok.Builder;
import lombok.Getter;

@Getter
//@Builder
public class PersonDto {
	
	Integer id;
	String name;
	LocalDate birthDate;
	@Embedded
	AddressDto address;

}
