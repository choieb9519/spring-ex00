package sample.junit;

import static org.junit.Assert.*;

import org.junit.Test;

public class MyTest1 {

	@Test
	public void test() {  //반드시 public void 그리고 파라미터 리턴값이 없어야함
		//fail("Not yet implemented"); 무조건 실패하는 매소드
		int i = 3;
		if (i != 3) {
			fail("i는 3이 아닙니다."); //성공
		}
	} 
	
	@Test
	public void equals() {
		int i = 3;
		boolean b = true;
		Object c = null;
		
		assertEquals(i, 3); //성공
		//첫번째 파라미터와 두번째 파라미터가 같아야 성공
		
		assertEquals(b, true);
		assertTrue(b);
		assertNull(c);
	}

	@Test
	public void notEquals() {
		int i = 5; //성공
		boolean b = false;
		Object c = new Object();
		
		assertNotEquals(i, 3);
		assertFalse(b);
		assertNotNull(c);
	}
}
