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
	public void contextLoads() {
	}
	
	@Test
	public void evenTest() {
		assertEquals(true, numberService.isEven(10));
	}
	
	@Test
	public void oddTest() {
		assertEquals(false, numberService.isEven(3));
	}

}
