package sample;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringJenkinsMainTest {
	public static Logger logger = LoggerFactory.getLogger(SpringJenkinsMainTest.class);
	@Test
	public void testContextLoads() {
		logger.info("test case executing...");  
		//assertEquals(true, true); 
	}

}
