import static org.junit.Assert.*;

import org.junit.Test;

public class CreateTest
{
	// everything is valid
	@Test
    public void testCase1()
	{
		assertEquals( "Successfully created the account!", Create.account("John", "John@gmail.com", "John1234", "John1234") );
    }

	// Retyped Password not same as Password
	@Test
    public void testCase2()
	{
		assertEquals( "The Retyped Password is different!", Create.account("John", "John@gmail.com", "John1234", "1234John") );
    }
	
	// Password does not meet specification
	@Test
    public void testCase3()
	{
		assertEquals( "The Password is invalid!", Create.account("Tom", "Tom@yahoo.com", "tom56789", "tom56789") );
    }

	// Password does not meet the length
	@Test
    public void testCase5()
	{
		assertEquals( "The Password is either too short or too long!", Create.account("Tom", "Tom@yahoo.com", "Tom567", "Tom567") );
    }
	
	// not a new Username in the database
	@Test
    public void testCase7()
	{
		assertEquals( "The Username is already exists!", Create.account("Alice", "Alice@outlook.com", "Alice4321", "Alice4321") );
    }
	
	// Username not an email
	@Test
    public void testCase13()
	{
		assertEquals( "The Username is invalid!", Create.account("Alice", "Alice", "Alice4321", "Alice4321") );
    }
	
	// Name does not meet the length
	@Test
    public void testCase19()
	{
		assertEquals( "The Name is too long!", Create.account("abcdefghijklmnop", "Bob@icloud.com", "Bob98765", "Bob98765") );
    }
}