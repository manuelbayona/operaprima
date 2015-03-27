package com.operaprima.services;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.dozer.DozerBeanMapper;
import org.dozer.Mapper;
import org.joda.time.DateTime;

import com.operaprima.commons.business.dtos.PhoneIntDto;
import com.operaprima.services.business.dtos.PersonIntDto;
import com.operaprima.services.facade.dtos.PersonDto;
import com.operaprima.services.facade.dtos.enums.UserStateEnum;
import com.operaprima.services.facade.dtos.enums.UserTypeEnum;

public class DozerTest {

	public static void main(final String[] args) {

		final PhoneIntDto tfno1 = new PhoneIntDto();
		tfno1.setNumber("123456789");

		final PhoneIntDto tfno2 = new PhoneIntDto();
		tfno2.setNumber("987654321");

		final List<PhoneIntDto> lista = new ArrayList<PhoneIntDto>();
		lista.add(tfno1);
		lista.add(tfno2);

		final PersonIntDto personaInterior = new PersonIntDto();
		personaInterior.setId("1234");
		personaInterior.setName("Manolo");
		personaInterior.setLastName("Bayona");
		final byte[] array = new byte[3];
		Arrays.fill(array, (byte) 1);
		personaInterior.setAvatar(array);
		personaInterior.setBirthDate(new DateTime());
		personaInterior.setType(UserTypeEnum.ADMIN);
		personaInterior.setPhones(lista);
		personaInterior.setState(UserStateEnum.ACTIVE);

		final Mapper mapper = new DozerBeanMapper();

		final PersonDto personaExterior = mapper.map(personaInterior, PersonDto.class);
		System.out.println("Wiii!");

	}

}
