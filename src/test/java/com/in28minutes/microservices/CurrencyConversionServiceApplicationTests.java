package com.in28minutes.microservices;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@EnableFeignClients
public class CurrencyConversionServiceApplicationTests {

	@Test
	public void contextLoads() {
	}

}
