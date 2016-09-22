package es.upm.miw.spai.ecp2;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import es.upm.miw.spai.ecp2.User;

public class UserTest {
	private User user1;
		
		@Before
	    public void before() {
			user1 = new User(1, "Alberto", "Jimenez");
	    }
	
		@Test
		public void testFullName() {
			assertEquals("Alberto Jimenez", user1.fullName());
		}
	
		@Test
		public void testInitials() {
			assertEquals("A.", user1.initials());
		}
	
		@Test
		public void testGetNumber() {
			assertEquals(1, user1.getNumber());
		}
	
		@Test
		public void testGetName() {
			assertEquals("Alberto", user1.getName());
		}
	
		@Test
		public void testGetFamilyName() {
			assertEquals("Jimenez", user1.getFamilyName());
		}

}
