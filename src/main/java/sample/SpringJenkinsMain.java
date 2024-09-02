package sample;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringJenkinsMain {
	public static Logger logger = LoggerFactory.getLogger(SpringJenkinsMain.class);
	@PostConstruct
	public void init() {
		logger.info("Application started"); 
		
	}

	public static void main(String[] args) {
		logger.info("application executed");  
		SpringApplication.run(SpringJenkinsMain.class, args);
	}

}
