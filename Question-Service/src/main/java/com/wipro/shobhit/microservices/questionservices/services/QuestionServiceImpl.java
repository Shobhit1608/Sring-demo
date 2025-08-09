package com.wipro.shobhit.microservices.questionservices.services;


import java.util.List;

import org.springframework.stereotype.Service;

import com.wipro.shobhit.microservices.questionservices.entities.Question;
import com.wipro.shobhit.microservices.questionservices.enums.Category;
import com.wipro.shobhit.microservices.questionservices.enums.DifficultyLevel;
import com.wipro.shobhit.microservices.questionservices.repositories.QuestionRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class QuestionServiceImpl implements QuestionService{
	
    private final QuestionRepository questionRepository;

	

    public List<Question> getQuestionsByCategory(Category category) {
		
        return questionRepository.findByCategory(category);

 }

 public Question addQuestion(Question question) {
     
     return questionRepository.save(question);
 }


	public List<Integer> getQuestionsForQuiz(Category  category, DifficultyLevel difficultyLevel) {
		 List<Integer> questions= questionRepository.findRandomByCategoryAndDifficulty(category, difficultyLevel);
		return questions;
	}
	
}
