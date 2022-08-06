package com.example.question.service;


import com.example.question.model.Question;

import java.util.List;
import java.util.Optional;

public interface QuestionService {
    List<Question> findAll();

    void save(Question question);

    Optional<Question> findById(int questionId);

    void update(int questionId, Question question);

    void remove(int questionId);

    List<Question> findByNameContaining(String name, String title);
}