import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestJiefuLing {

	@Test
	public void testGetFullName() {
		String result = new JiefuLing().getFullName();
		Assertions.assertEquals("Jiefu Ling", result);
	}
	
	@Test
	public void testGetFirstName() {
		String result = new JiefuLing().getFirstName();
		Assertions.assertEquals("Jiefu", result);
	}
	
	@Test
	public void testGetLastName() {
		String result = new JiefuLing().getLastName();
		Assertions.assertEquals("Ling", result);
	}
	
	@Test
	public void testGetUCInetID() {
		String result = new JiefuLing().getUCInetID();
		Assertions.assertEquals("jieful2", result);
	}
	
	@Test
	public void testGetStudentNumber() {
		int result = new JiefuLing().getStudentNumber();
		Assertions.assertEquals(25008346, result);
	}
	
	@Test
	public void testGetRotatedFullName5() {
		String result = new JiefuLing().getRotatedFullName(5);
		Assertions.assertEquals(" LingJiefu", result);
	}
	
	@Test
	public void testGetRotatedFullNameMinus2() {
		String result = new JiefuLing().getRotatedFullName(-2);
		Assertions.assertEquals("efu LingJi", result);
	}

}
