package com.mavenTest;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class mocoTest01 {
  @Test
  public void f() {
	  System.out.println("test");
  }
  @BeforeClass
  public void beforeClass() {
	  System.out.println("test");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("test");
  }

}
