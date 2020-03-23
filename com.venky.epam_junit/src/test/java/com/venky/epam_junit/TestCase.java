package com.venky.epam_junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class TestCase {
	StringModify obj;
	@BeforeEach
	void setup() {
		obj = new StringModify();
	}
	
	@Test
	void test1() {
		assertEquals("BCD",obj.changeString("ABCD"));
	}
	
	@Test
	void test2() {
		assertEquals("CD",obj.changeString("AACD"));
	}
	
	@Test
	void test3() {
		assertEquals("BCD",obj.changeString("BACD"));
	}
	
	@Test
	void test4() {
		assertEquals("BBAA",obj.changeString("BBAA"));
	}
	
	@Test
	void test5() {
		assertEquals("BAA",obj.changeString("AABAA"));
	}
	
}
