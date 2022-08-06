package com.example.question.service;

import com.example.question.model.QuestionType;
import com.example.question.repository.QuestionTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionTypeServiceImpl implements QuestionTypeService {
    @Autowired
    private QuestionTypeRepository questionTypeRepository;

    @Override
    public List<QuestionType> findAll() {
        return questionTypeRepository.findAll();
    }

    @Override
    public void save(QuestionType questionType) {
        questionTypeRepository.save(questionType);
    }
}