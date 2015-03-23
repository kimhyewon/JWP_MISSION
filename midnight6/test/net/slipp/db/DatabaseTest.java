package net.slipp.db;

import static org.junit.Assert.*;
import net.slipp.user.User;

import org.junit.Test;

public class DatabaseTest {
	public static User TEST_USER = new User("userId", "password", "name", "email");
	
	@Test
	//디비에 데이터 추가한 다음 사용자 정보를 조회해오기
	public void addAndFind() {
		Database2.addUser(TEST_USER);
		User dbUser = Database2.findByUserId(TEST_USER.getUserId());
		assertEquals(TEST_USER, dbUser);
	}
	
	//디비에 사용자가 존재하지 않을 때 테스트 
	public void addAndFindWhenNotExisted() {
		User dbUser = Database2.findByUserId("userId2");
		assertNull(dbUser);
	}
	
	
}
