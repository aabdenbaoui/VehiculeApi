package com.udacity.pricing;
import static org.junit.jupiter.api.Assertions.assertThrows;

import com.udacity.pricing.api.PricingController;
import com.udacity.pricing.service.PriceException;
import com.udacity.pricing.service.PricingService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.server.ResponseStatusException;

import java.math.BigDecimal;

import static org.junit.Assert.assertTrue;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PricingServiceApplicationTests {

    @Autowired
	PricingController pricingController;

	@Test
	public void contextLoads()  {
	}
	@Test
	public void testPriceNotFoundThrowException(){
//		System.out.println(pricingController.get(100L));
		ResponseStatusException thrown = assertThrows(
				ResponseStatusException.class,
				() -> pricingController.get(100L),
				"Price Not Found"
		);
		System.out.println(thrown.getStatus().getClass());
		assertTrue(thrown.getStatus().toString().equals("404 NOT_FOUND"));
	}


}
