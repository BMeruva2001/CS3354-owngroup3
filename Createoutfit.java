import java.util.ArrayList;
public class Createoutfit{
    private boolean login;
    public static ArrayList<Outfit> outfit = new ArrayList<Outfit>();
    private String outfit_name; 
    private boolean item; 
  
 
    public boolean does_outfit_exist(String outfit_name)
    {
        boolean exists = false;
        for(int i = 0; i< outfit.size(); i++)
        {
            if(outfit.get(i).Name == outfit_name)
            {
                exists = true;

            }
            else
            {
                exists = false;
            }
        }
        return exists;
    }

    



    public Createoutfit(boolean login, boolean item, String outfit_name){

        if(login && item && !does_outfit_exist(outfit_name))
        {
            Outfit outfit1 = new Outfit(outfit_name);
            outfit.add(outfit1);

            System.out.println(outfit_name + " has been created as a new outfit");

        }
        else if(login && !item && !does_outfit_exist(outfit_name))
        {
            System.out.println( "the selected item is unavailable!");


        }
        else if(!login && item && !does_outfit_exist(outfit_name))
        {
            System.out.println( "please login to continue");
    
            
        }
        else if(login && item && does_outfit_exist(outfit_name))
        {
            System.out.println( "please choose a different name for your outfit, this name already exists!");
            
        }


    }

}

