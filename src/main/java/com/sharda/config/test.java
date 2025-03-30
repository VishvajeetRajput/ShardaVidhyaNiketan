package com.sharda.config;

import java.util.Iterator;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class test {
	private static final Logger LOGGER = LoggerFactory.getLogger(test.class);

	@GetMapping("/test")
	public  void getData() throws InterruptedException {
			
		long time= System.currentTimeMillis();
		ExecutorService executorService = Executors.newFixedThreadPool(60);
		for (int i = 1; i <= 10000; i++) {
			int finalL=i;
//			System.out.println(finalL);
			executorService.submit(()->LOGGER.info(""+finalL));
		}
		executorService.shutdown();
		
		if (executorService.awaitTermination(1, TimeUnit.MINUTES)) {
	        long totalTime = System.currentTimeMillis() - time;
	        LOGGER.info("Total time: " + totalTime);
	    } else {
	    	LOGGER.info("Executor did not terminate in the expected time.");
	    }
		
		
//		total time :460
		
		
	}
	
	
	
}
