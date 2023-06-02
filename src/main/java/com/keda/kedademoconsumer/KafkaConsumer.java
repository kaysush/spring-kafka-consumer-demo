package com.keda.kedademoconsumer;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaConsumer {


  @KafkaListener(topics = "${kafka.topic}", groupId = "${kafka.consumer-group-id}")
  public void handle(String message) {
    System.out.println("Consumed a message : " + message);
  }

}
