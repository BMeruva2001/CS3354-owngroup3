import static org.junit.Assert.*;

import org.junit.Test;


public class Createoutfittest {

   @Test
   public void testCase1(){
      Createoutfit create = new Createoutfit(true, true, "Date outfit");

   }
   @Test
   public void testCase2(){
      Createoutfit create1 = new Createoutfit(true, false, "Valentine's outfit");

   }
   @Test
   public void testCase3(){
      Createoutfit create2 = new Createoutfit(false, true, "Christmas dinner outfit");

   }
   @Test
   public void testCase4(){
      Createoutfit create3 = new Createoutfit(true, true, "Date outfit");

   }


    
}

