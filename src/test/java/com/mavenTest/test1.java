package com.mavenTest;

public class test1 {
	
	public void test01() {
	
		for(int i=0;i<3;i++) {
			System.out.println("测试："+i);
			this.test02();
		}	
	}
	
	public void test02() {
			System.out.println("github+jenkins持续集成");	
	}
	public static void main(String[] args) {
		test1 test1 =new test1();
		test1.test01();

	}

}
