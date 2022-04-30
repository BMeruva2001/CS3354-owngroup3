public class Login
{
	// the existing Username and Password
	public static String[] account = {"Alice@outlook.com", "Christ@gmail.com"};
	public static String[] accountPass = {"Alice1234", "Christ5678"};
	
	// main method
	public static String login(String username, String password)
	{
		// loop through each Username in the database
		int i = 0;
		for (String user : account)
    	{
			// exists
    		if (username.equals(user))
    		{
    			// see whether the entered password same as accountPass at specify index
    			if (password.equals(accountPass[i]))
    				return "Logging in...";
    		}
    		
    		// uses as index of the associated Username and Password
    		i++;
    	}
		
		// if Username not in the database or Username and Password do not match
		return "Invalid Username or Password!!";
	}
}