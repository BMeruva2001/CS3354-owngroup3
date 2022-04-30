public class Create
{
	// specify the length of Name and Password
	public static final int nameMax = 15;
	public static final int passMin= 8;
	public static final int passMax = 12;
	
	// the existing Username
	public static String[] existing = {"Alice@outlook.com", "Christ@gmail.com"};
	
	// main method
	public static String account(String name, String username, String password, String retype)
	{
		// if Name exceed 15 characters
		if (checkLength(name, 1) == 1 )
    		return "The Name is too long!";
		// if not an email
		if (checkEmail(username))
    		return "The Username is invalid!";
		// not a new Username
		if (checkUser(username))
			return "The Username is already exists!";
		// Password does not meet the length
		if (checkLength(password, 2) == 2 )
    		return "The Password is either too short or too long!";
		// Password does not have at least one upper case letter, one lower case letter, and one digit 
		if (checkPass(password))
    		return "The Password is invalid!";
		// Retyped Password and Password not the same
		if (password != retype)
    		return "The Retyped Password is different!";
		// everything is fine
		return "Successfully created the account!";
	}

	// method to check if Username exists in the database
	public static boolean checkUser(String username)
	{
		// loop through each Username in the database
		for (String user : existing)
    	{
			// exists
    		if (username.equals(user))
    			return true;
    	}
		
		// new Username
		return false;
	}
	
	// method to check is the Username an email
	public static boolean checkEmail(String username)
	{
		// loop through each character of the Username
		for (int i = 0; i < username.length(); i++)
		{
			// without '@' is not email; "@." not email as well
			if (username.charAt(i) == '@' && username.charAt(i+1) != '.')
			{
				// email should have ".com" at the end
				String temp = username.substring(username.length() - 4);
				if (temp.equals(".com"))
					return false;
			}
		}
		
		// does not have '@' and/or ".com"; "@.com" invalid
		return true;
	}
			
	// method to check is the Password meets the specification
	public static boolean checkPass(String password)
	{
		boolean upper = false, lower = false, digit = false;
		char c;
		
		// loop through each character of Password
		for (int i = 0; i < password.length(); i++)
		{
			c = password.charAt(i);
			
			// contain at least one upper case letter
			if (Character.isUpperCase(c))
				upper = true;
			// contain at least one lower case letter
			if (Character.isLowerCase(c))
				lower = true;
			// contain at least one digit
			if (Character.isDigit(c))
				digit = true;
		}
		
		// valid Password
		if (upper == true && lower == true && digit == true)
			return false;
		
		// missing at least one of the three requirements
		return true;
	}
	
	// method to check length of Name and Password
	public static int checkLength(String arg, int flag)
	{
		// check Name
		if (flag == 1)
		{
			if (arg.length() > nameMax)
				return 1;
		}
		// check Password
		else
		{
			if (arg.length() < passMin || arg.length() > passMax)
			return 2;
		}
		
		// unuse
		return 0;
	}
}	// end of program