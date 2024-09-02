package sample;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class SpringJenkinsMainTest {
	public static Logger logger = LoggerFactory.getLogger(SpringJenkinsMainTest.class);
	@Test
	public void testContextLoads() {
		logger.info("test case executing...");  
		assertEquals(true, true); 
	}

}
