package com.mockito.AutomateRestAPIs;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.test.annotation.DirtiesContext;

import com.mockito.AutomateRestAPIs.service.Business;
import com.mockito.AutomateRestAPIs.service.Helper;

@RunWith(MockitoJUnitRunner.Silent.class)
@DirtiesContext
public class BusinessTest {

	Business business;

	@Mock
	Helper helper;
	
	@Before
	public void init() {
		business = new Business();
		MockitoAnnotations.initMocks(this);
	}

	@Test
	public void testFindTheGreatestFromAllData_ForOneValue() {
		when(helper.getMethods()).thenReturn(5);
		assertEquals(10,business.randomSum());
	}

}
