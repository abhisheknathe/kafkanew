package com.example.kafka.kafkatutorial.kafka;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaProducer {
	
	private KafkaTemplate<String, String> kafkaTemplate;
	private static final Logger logger = LoggerFactory.getLogger(KafkaProducer.class);

	public KafkaProducer(KafkaTemplate<String, String> kafkaTemplate) {
		super();
		this.kafkaTemplate = kafkaTemplate;
	}
	
	public void sendMessage(String msg) {
		logger.info("Message sent as -- ",msg);
		kafkaTemplate.send("my-topic",msg);
	}

}
