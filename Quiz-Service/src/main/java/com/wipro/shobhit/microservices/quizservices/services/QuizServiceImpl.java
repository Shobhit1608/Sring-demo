package com.wipro.shobhit.microservices.quizservices.services;


import java.util.List;

import org.springframework.stereotype.Service;

import com.wipro.shobhit.microservices.quizservices.entities.Quiz;
import com.wipro.shobhit.microservices.quizservices.feign.QuizInterface;
import com.wipro.shobhit.microservices.quizservices.repositories.QuizRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class QuizServiceImpl  implements QuizService{
	
	private final QuizRepository quizRepository;
	private final QuizInterface quizInterface;
    
	@Override
	public Quiz createQuiz(String category, String level, String title) {
//		List<Question> questions = questionRepository.findRandomByCategoryAndDifficulty(category,level);
		
		List<Integer> questionIdsForQuiz = quizInterface.getQuestionsForQuiz(category, level);
		Quiz quiz = new Quiz();
		quiz.setQuizTitle(title);
		quiz.setQuestionsIds(questionIdsForQuiz);
		return quizRepository.save(quiz);
		
	}

//	@Override
//	public List<QuestionWrapper> getQuizQuestions(Long id) {
//		Quiz quiz = quizRepository.findById(id).
//						orElseThrow(() -> new QuestionNotFoundException("Question not found with ID: " + id));
//
//        List<Question> questionsFromDB = quiz.getQuestions();
//        List<QuestionWrapper> questionsForUser = new ArrayList<>();
//        
//        for(Question question : questionsFromDB) {
//        	questionsForUser.add(new QuestionWrapper(
//        			question.getId(),
//        			question.getQuestionTitle(),
//        			question.getOption1(),
//        			question.getOption2(),
//        			question.getOption3(),
//        			question.getOption4()
//        			));
//        }
//		
//		return questionsForUser;
//	}
//
//	@Override
//	public Integer calculateResult(Long id, List<Response> responses) {
//	    Quiz quiz = quizRepository.findById(id)
//	            .orElseThrow(() -> new QuestionNotFoundException("Question not found with ID: " + id));
//
//	    if (quiz == null)
//	        return 0;
//
//	    List<Question> questions = quiz.getQuestions();
//	    int score = 0;
//
//	    for (Response response : responses) {
//	        for (Question question : questions) {
//	            if (question.getId().equals(response.getId())) {
//	                if (question.getCorrectAnswer().equalsIgnoreCase(response.getUserAnswer())) {
//	                    score++;
//	                }
//	                break; 
//	            }
//	        }
//	    }
//
//	    return score;
	
}

