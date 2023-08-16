package com.example.kafka.kafkatutorial.kafka;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(KafkaConsumer.class);

	@KafkaListener(topics = "my-topic",groupId = "mygroup")
	public void consume(String message) {
		LOGGER.info(String.format("Message Recieved as -->", message));
		
		
	}
	
}
