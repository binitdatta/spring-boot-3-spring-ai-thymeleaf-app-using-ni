package com.rollingstone.controller;

import com.rollingstone.records.Answer;
import com.rollingstone.records.Question;
import com.rollingstone.service.QAndAService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AskController {

  Logger logger  = LoggerFactory.getLogger("AskController");

  private final QAndAService qAndAService;

  public AskController(QAndAService qAndAService) { // <1>
    this.qAndAService = qAndAService;
  }

  @PostMapping(path="/ask", produces="application/json")
  public Answer ask(@RequestBody Question question) {
    logger.info("Question : " + question.question());
      return qAndAService.askQuestion(question);
  }

}
