package com.rollingstone.service;

import com.rollingstone.records.Answer;
import com.rollingstone.records.Question;

public interface QAndAService {
    Answer askQuestion(Question question);
}
