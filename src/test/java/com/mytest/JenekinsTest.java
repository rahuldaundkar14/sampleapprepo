package com.mytest;

import org.testng.annotations.Test;

import com.pages.MyPage;

public class JenekinsTest {

	@Test
	public void sampleTest() {
		System.out.println("Testsssssss...");
		MyPage myPage = new MyPage();
		myPage.initilise();
	}
}
