import junit.framework.TestCase;

public class TestUtil extends TestCase {
	Even e;
	public void setUp(){
		e = new Even();
	}
	public void testCheckEven(){
		assertTrue(e.checkeven(2));
	}
	
	public void testCheckEvenNegative(){
		assertTrue(!e.checkeven(1));
	}
	public void testSum(){
		assertEquals(5, e.sum(2,3));
	}
 
}
