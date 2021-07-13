package com.everis.topic.producer;

import com.everis.model.Deposit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

/**
 * Clase Productor del Deposit.
 */
@Component
public class DepositProducer {
  
  @Autowired
  private KafkaTemplate<String, Deposit> kafkaTemplate;

  private String depositAccountTopic = "created-deposit-topic";

  /** Envia datos del deposito al topico. */
  public void sendDepositAccountTopic(Deposit deposit) {
  
    kafkaTemplate.send(depositAccountTopic, deposit);
  
  }
  
}
