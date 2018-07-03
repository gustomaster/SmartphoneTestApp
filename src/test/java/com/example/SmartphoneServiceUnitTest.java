package com.example;

import com.example.domain.Smartphone;
import com.example.service.SmartphoneService;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;



@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class SmartphoneServiceUnitTest {

	@Autowired
	private SmartphoneService smartphoneService;
	
	@Test
	public void findAllTest() throws Exception {
		List<Smartphone> list = smartphoneService.findAll();
	}
	@Test
	public void findOneTest() throws Exception {
		smartphoneService.findOne(1);
	}
}