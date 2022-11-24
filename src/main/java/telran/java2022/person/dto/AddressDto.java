package telran.java2022.person.dto;

import javax.persistence.Embeddable;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Embeddable
@NoArgsConstructor
public class AddressDto {
	String city;
	String street;
	Integer building;

}
