package com.mavenTest;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class NewTest {
  @Test
  public void f() {
	  System.out.println("test");
	  throw new RuntimeException("测试异常01");  
  }
  
  @Test
  public void fa() {
	  System.out.println("test");
	  throw new RuntimeException("测试异常01");  
  }
  
  @BeforeClass
  public void beforeClass() {
	  System.out.println("test");
  }

  @AfterClass
  public void afterClass() {	
	  System.out.println("test");
	  System.out.println("测试1");
  }

}
