
package passwordvalidator;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;

/**
 * Test class for PasswordValidatir class
 * @author Kubra Bas
 */
public class PasswordValidatorTest {

    public PasswordValidatorTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {

        System.out.println("-------- ");
    }

    /**
     * Test of main method, of class PasswordValidator.
     */
    @Ignore
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        PasswordValidator.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isValidLength method, of class PasswordValidator for bad case.
     */
    @Test
    public void testIsValidLengthBad() {

        System.out.println("isValidLengthBad");
        String password = "";
        System.out.println("Testing: " + password);
        boolean expResult = false;
        boolean result = PasswordValidator.isValidLength(password);

        assertEquals(expResult, result);

    }

    /**
     * Test of isValidLength method, of class PasswordValidator good case.
     */
    @Test
    public void testIsValidLengthGood() {

        System.out.println("isValidLengthGood");
        String password = "MyPassword123";
        System.out.println("Testing: " + password);

        boolean expResult = true;
        boolean result = PasswordValidator.isValidLength(password);

        assertEquals(expResult, result);

    }

    /**
     * Test of isValidLength method, of class PasswordValidator for boundry
     * value.
     */
    @Test
    public void testIsValidLengthBoundary() {

        System.out.println("isValidLengthBoundry");
        String password = "Password";
        System.out.println("Testing: " + password);

        boolean expResult = true;
        boolean result = PasswordValidator.isValidLength(password);

        assertEquals(expResult, result);

    }

    /**
     * Test of isContainUpperCase method, of class PasswordValidator for bad
     * case.
     */
    @Test
    public void testIsContainUpperCaseBad() {

        System.out.println("isContainUpperCaseBad");
        String password = "hello123";
        System.out.println("Testing: " + password);

        boolean expResult = false;
        boolean result = PasswordValidator.isContainUpperCase(password);

        assertEquals(expResult, result);
    }

    /**
     * Test of isContainUpperCase method, of class PasswordValidator for good
     * case.
     */
    @Test
    public void testIsContainUpperCaseGood() {

        System.out.println("isContainUpperCaseGood");
        String password = "HELLOO";
        System.out.println("Testing: " + password);

        boolean expResult = true;
        boolean result = PasswordValidator.isContainUpperCase(password);

        assertEquals(expResult, result);
    }

    /**
     * Test of isContainUpperCase method, of class PasswordValidator for
     * boundary case.
     */
    @Test
    public void testIsContainUpperCaseBoundary() {

        System.out.println("isContainUpperCaseBoundary");
        String password = "heLlo";
        System.out.println("Testing: " + password);

        boolean expResult = true;
        boolean result = PasswordValidator.isContainUpperCase(password);

        assertEquals(expResult, result);
    }

    /**
     * Test of isContainSpecialChar method, of class PasswordValidator for good
     * case.
     */
    @Test
    public void testIsContainSpecialCharGood() {

        System.out.println("isContainSpecialCharGood");
        String password = "Hello_123*";
        System.out.println("TestIng: " + password);

        boolean expResult = true;
        boolean result = PasswordValidator.isContainSpecialChar(password);

        assertEquals(expResult, result);
    }

    /**
     * Test of isContainSpecialChar method, of class PasswordValidator for bad
     * case.
     */
    @Test
    public void testIsContainSpecialCharBad() {

        System.out.println("isContainSpecialCharBad");
        String password = "hello";
        System.out.println("Testing: " + password);

        boolean expResult = false;
        boolean result = PasswordValidator.isContainSpecialChar(password);

        assertEquals(expResult, result);
    }

    /**
     * Test of isContainSpecialChar method, of class PasswordValidator for
     * boundary case.
     */
    @Test
    public void testIsContainSpecialCharBoundary() {

        System.out.println("isContainSpecialCharBoundary");
        String password = "Hello123*";
        System.out.println("Testing: " + password);

        boolean expResult = true;
        boolean result = PasswordValidator.isContainSpecialChar(password);

        assertEquals(expResult, result);
    }

}
