package Day_05;

import org.testng.annotations.*;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class TestNG1 {
  @Test
  public void testcase1() {
	  System.out.println("login page");
  }
  @Test
  public void testcase2() {
	  System.out.println("search product");

  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("chrome browser launch nd open application");

  }
  @AfterMethod
  public void afterMethod() {
	  System.out.println("closing application" );
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("chrome browser launch nd open application- before class");

  }

  @AfterClass
  public void afterClass() {
	  System.out.println("closing application-after class" );

  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("chrome browser launch nd open application- before test");

  }

  @AfterTest
  public void afterTest() {
	  System.out.println("closing application -after test" );

  }

}
