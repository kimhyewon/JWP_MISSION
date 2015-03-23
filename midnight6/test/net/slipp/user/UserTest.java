package net.slipp.user;

import static org.junit.Assert.*;
import net.slipp.db.Database2;

import org.junit.Test;

public class UserTest {
	public static User TEST_USER = new User("userId", "password", "name", "email");
	
	@Test
	//디비에 사용자 존재할 경우 비밀번호 맞는지 확인하는 테스트
	public void matchPassword() {
		assertTrue(TEST_USER.matchPassword("password"));
	}
	
	@Test
	//비밀번호 맞지 않을 경우 테스트 
	public void notMatchPassword()  {
		assertFalse(TEST_USER.matchPassword("password2"));
	}
	
	@Test
	public void login() throws Exception {
		User user = UserTest.TEST_USER;
		Database2.addUser(user);
		assertTrue(User.login(TEST_USER.getUserId(), TEST_USER.getPassword()));
	}
	
	@Test(expected=UserNotFoundException.class)
	public void loginWhenNotExistedUser() throws Exception {
		User.login("userId2", TEST_USER.getPassword());
	}

	@Test(expected=PasswordMismatchException.class)
	public void loginWhenPasswordMismatch() throws Exception {
		User user = UserTest.TEST_USER;
		Database2.addUser(user);
		User.login(TEST_USER.getUserId(), "password2");
	}
}
