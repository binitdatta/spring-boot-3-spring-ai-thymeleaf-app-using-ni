package com.rollingstone.service;

import com.rollingstone.records.Answer;
import com.rollingstone.records.Question;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.ai.chat.client.ChatClient;
import org.springframework.stereotype.Service;

@Service
public class QAndAServiceImpl implements com.rollingstone.service.QAndAService {

  private final ChatClient chatClient;

  public QAndAServiceImpl(ChatClient.Builder chatClientBuilder) { // <1>
    this.chatClient = chatClientBuilder.build(); // <2>
  }

  Logger logger  = LoggerFactory.getLogger("QAndAServiceImpl");

  @Override
  public Answer askQuestion(Question question) {

    var answerText = chatClient.prompt()
        .user(question.question())      // <3>
        .call()
        .content();
    logger.info("answerText :"+answerText);
    return new Answer(answerText);
  }

}
