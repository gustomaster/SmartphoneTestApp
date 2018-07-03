package com.example;

import com.example.domain.Smartphone;
import com.example.repository.SmartphoneRepository;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;



@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class SmartphoneRepositoryUnitTest {

	@Autowired
	private SmartphoneRepository smartphoneRepository;
	Smartphone smartphone1;
	Smartphone smartphone2;
	
	@Before
	public void setup() {
		//smartphoneRepository.deleteAll();
		smartphone1 = new Smartphone();
		smartphone1.setId(1);
		smartphone1.setName("Name1");
		smartphone1.setMaker("maker1");
		smartphone1.setColor("color1");
		smartphone1.setPrice(11111);
		smartphone1.setRelease("2017-1-1");
		
		smartphone2 = new Smartphone();
		smartphone2.setId(2);
		smartphone2.setName("Name2");
		smartphone2.setMaker("maker2");
		smartphone2.setColor("color2");
		smartphone2.setPrice(22222);
		smartphone2.setRelease("2017-2-2");
		
		smartphoneRepository.save(smartphone1);
		smartphoneRepository.save(smartphone2);
	}
	@Test
	public void findOneTest() throws Exception{
		System.out.println("*****findOneテスト開始*****");
		Smartphone smartphone1 = smartphoneRepository.findOne(1);
		Smartphone smartphone2 = smartphoneRepository.findOne(2);
		assertEquals(smartphone1.getName(), "Name1");
		assertEquals(smartphone2.getColor(), "color2");
	}
		
}