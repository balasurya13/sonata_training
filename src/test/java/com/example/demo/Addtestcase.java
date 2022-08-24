package com.example.demo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.example.demo.impl.Defaultaddition;
import com.sonata.Addinterface;


class AddtestCase {

   @Test
	void addTest5() {
	Addinterface add = new Defaultaddition();
	assertEquals(20,add.add(10,10));
	 
}
	@Test
	void addTest6() {
	Addinterface add = new Defaultaddition();
	assertEquals(20,add.add(10,10));
	 
}

}