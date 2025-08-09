package com.wipro.shobhit.microservices.quizservices.services;

import java.util.List;

import com.wipro.shobhit.microservices.quizservices.entities.QuestionWrapper;
import com.wipro.shobhit.microservices.quizservices.entities.Quiz;
import com.wipro.shobhit.microservices.quizservices.entities.Response;

public interface QuizService {

	Quiz createQuiz(String category, String level, String title);

//	List<QuestionWrapper> getQuizQuestions(Long id);
//	Integer calculateResult(Long id, List<Response> responses);

}
