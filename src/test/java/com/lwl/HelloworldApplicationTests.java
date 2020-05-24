package com.lwl;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.lwl.hw.web.NumberService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class HelloworldApplicationTests {
	
	@Autowired
	private NumberService numberService;
	
	@Test
	public void evenTest() {
		boolean res = numberService.isEven(10);
		assertEquals(true,res);
	}
	
	@Test
	public void oddTest() {
		boolean res =  numberService.isEven(3);
		assertEquals(false,res);
	}
	@Test
	public void isPrimeWithPrimeTest() {
		boolean res = numberService.isPrime(3);
		assertEquals(true, res);
	}
	@Test
	public void isPrimeNonPrimeTest() {
		boolean res = numberService.isPrime(10);
		assertEquals(false, res);
	}
	@Test
	public void isPrimeLess2Test() {
		boolean res = numberService.isPrime(1);
		assertEquals(false, res);
	}
	@Test
	public void isPrimeWithEvenTest() {
		boolean res = numberService.isPrime(2);
		assertEquals(true, res);
	}

}
