import static org.junit.Assert.*;

import org.junit.Test;

public class LoginTest
{
	// valid for Alice@outlook.com
	@Test
    public void testCase1()
	{
		assertEquals( "Logging in...", Login.login("Alice@outlook.com", "Alice1234") );
    }

	// valid for Christ@gmail.com
	@Test
    public void testCase2()
	{
		assertEquals( "Logging in...", Login.login("Christ@gmail.com", "Christ5678") );
    }
	
	// not matched
	@Test
    public void testCase3()
	{
		assertEquals( "Invalid Username or Password!!", Login.login("Alice@outlook.com", "Christ5678") );
    }
	
	// not exist
	@Test
    public void testCase4()
	{
		assertEquals( "Invalid Username or Password!!", Login.login("Tom@yahoo.com", "Christ5678") );
    }
}
