package com.wipro.shobhit.microservices.questionservices.services;


import java.util.List;


import com.wipro.shobhit.microservices.questionservices.enums.Category;
import com.wipro.shobhit.microservices.questionservices.enums.DifficultyLevel;


public interface QuestionService {


	List<Integer> getQuestionsForQuiz(Category category, DifficultyLevel difficultyLevel);


}
