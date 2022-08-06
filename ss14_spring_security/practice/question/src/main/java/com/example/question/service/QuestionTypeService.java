package com.example.question.service;

import com.example.question.model.QuestionType;

import java.util.List;

public interface QuestionTypeService {
    List<QuestionType> findAll();

    void save(QuestionType questionType);
}