package com.trading;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
public class TradingAlgoApplication {

	public static void main(String[] args) {
		SpringApplication.run(TradingAlgoApplication.class, args);

		TestModel testModel = TestModel.builder().number(1).build();
		System.out.println(testModel.getNumber());
		log.info(String.valueOf(testModel.getNumber()));
	}

}
