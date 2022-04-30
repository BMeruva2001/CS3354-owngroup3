import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.beans.Transient;

public class AddToCarttest {
    AddToCart shopper;

    @BeforeEach
    void setUp() {
        shopper = new AddToCart();
    }

    @AfterEach
    void tearDown() {
        //
    }

    @Test
    void testCase1(){
        shopper.userLogin();
        shopper.addItem(2);
        shopper.userLogout();
    }
    
    @Test
    void testCase2(){
        shopper.userLogout();
        shopper.addItem(5);
    }

    @Test
    void testCase3(){
        shopper.userLogin();
        shopper.addItem(999);
    }

    @Test
    void testCase4(){
        shopper.userLogin();
        shopper.addItem(99);
        shopper.addItem(5);
        shopper.userLogout();
    }


}
