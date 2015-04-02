package com.operaprima.services.facade.users;

import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.dozer.Mapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import com.operaprima.services.business.dtos.PersonsIntDto;
import com.operaprima.services.business.dtos.UserIntDto;
import com.operaprima.services.business.dtos.UsersIntDto;
import com.operaprima.services.business.users.IIntUsersService;
import com.operaprima.services.facade.dtos.PersonsDto;
import com.operaprima.services.facade.dtos.UserDto;
import com.operaprima.services.facade.dtos.UsersDto;

/**
 * @author Stormtroopers
 *
 */
@RunWith(MockitoJUnitRunner.class)
public class UsersServiceTest {

	@InjectMocks
	private UsersService usersService;

	@Mock
	private Mapper mapper;

	@Mock
	private IIntUsersService iIntUsersService;

	private static final String ID = "1234";

	@Test
	public void addUser() {
		// given
		final UserDto userDto = new UserDto();
		final UserIntDto userIntDto = new UserIntDto();

		when(mapper.map(userDto, UserIntDto.class)).thenReturn(userIntDto);
		when(iIntUsersService.addUser(userIntDto)).thenReturn(userIntDto);
		when(mapper.map(userIntDto, UserDto.class)).thenReturn(userDto);

		// when
		final UserDto addUser = usersService.addUser(userDto);

		// then
		assertNotNull(addUser);
		verify(mapper).map(userDto, UserIntDto.class);
		verify(iIntUsersService).addUser(userIntDto);
		verify(mapper).map(userIntDto, UserDto.class);
	}

	@Test
	public void listUsers() {
		// given
		final UsersDto usersDto = new UsersDto();
		final UsersIntDto usersIntDto = new UsersIntDto();

		when(iIntUsersService.listUsers()).thenReturn(usersIntDto);
		when(mapper.map(usersIntDto, UsersDto.class)).thenReturn(usersDto);

		// when
		final UsersDto listUsers = usersService.listUsers();

		// then
		assertNotNull(listUsers);
		verify(mapper).map(usersIntDto, UsersDto.class);
	}

	@Test
	public void getUser() {
		// given
		final UserDto userDto = new UserDto();
		final UserIntDto userIntDto = new UserIntDto();

		when(iIntUsersService.getUser(ID)).thenReturn(userIntDto);
		when(mapper.map(userIntDto, UserDto.class)).thenReturn(userDto);

		// when
		final UserDto getUser = usersService.getUser(ID);

		// then
		assertNotNull(getUser);
		verify(iIntUsersService).getUser(ID);
		verify(mapper).map(userIntDto, UserDto.class);
	}

	@Test
	public void updateUser() {
		// given
		final UserDto userDto = new UserDto();
		final UserIntDto userIntDto = new UserIntDto();

		when(mapper.map(userDto, UserIntDto.class)).thenReturn(userIntDto);
		when(iIntUsersService.updateUser(userIntDto)).thenReturn(userIntDto);
		when(mapper.map(userIntDto, UserDto.class)).thenReturn(userDto);

		// when
		final UserDto updateUser = usersService.updateUser(userDto);

		// then
		assertNotNull(updateUser);
		verify(mapper).map(userDto, UserIntDto.class);
		verify(iIntUsersService).updateUser(userIntDto);
		verify(mapper).map(userIntDto, UserDto.class);
	}

	@Test
	public void listPersonsByUser() {
		// given
		final PersonsDto personsDto = new PersonsDto();
		final PersonsIntDto personsIntDto = new PersonsIntDto();

		when(iIntUsersService.listPersonsByUser(ID)).thenReturn(personsIntDto);
		when(mapper.map(personsIntDto, PersonsDto.class)).thenReturn(personsDto);

		// when
		final PersonsDto listPersonsByUser = usersService.listPersonsByUser(ID);

		// then
		assertNotNull(listPersonsByUser);
		verify(iIntUsersService).listPersonsByUser(ID);
		verify(mapper).map(personsIntDto, PersonsDto.class);
	}
}
