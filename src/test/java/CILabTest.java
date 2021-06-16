import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class CILabTest {

    private CILabInterface myString;

    @BeforeEach
    public void setUp() {
        myString = new CILab();
    }

    @AfterEach
    public void tearDown() {
        myString = null;
    }

    @Test
    public void detectCapitalUseTest1() {
    	
       myString = new CILab();
       myString.setString("ABC");
             
       assertTrue( myString.detectCapitalUse());    
       
    }
    @Test
    public void detectCapitalUseTest2() {
    	myString = new CILab();
        myString.setString("method");
              
        assertTrue( myString.detectCapitalUse());  
    }
    
    @Test
    public void detectCapitalUseTest3() {
    	myString = new CILab();
        myString.setString("Washington");
              
        assertTrue( myString.detectCapitalUse());  
    }

    @Test
    public void detectCapitalUseTest4() {
    	myString = new CILab();
        myString.setString("ORegon");
              
        assertFalse( myString.detectCapitalUse());       
    }

}
