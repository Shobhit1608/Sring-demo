package com.wipro.shobhit.microservices.quizservices.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.wipro.shobhit.microservices.quizservices.entities.QuestionWrapper;
import com.wipro.shobhit.microservices.quizservices.entities.Quiz;
import com.wipro.shobhit.microservices.quizservices.entities.Response;
import com.wipro.shobhit.microservices.quizservices.services.QuizService;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
@RequiredArgsConstructor
@RequestMapping("/api/v1/quiz")
public class QuizController {

    private final QuizService quizService;
    
	@PostMapping("/create")
	public Quiz createQuiz(@RequestParam String category, @RequestParam String level, @RequestParam String title) {
		return quizService.createQuiz(category, level, title);
	}
	
//	@GetMapping("/getQuizByID/{id}")
//    public List<QuestionWrapper> getQuizQuestions(@PathVariable Long id) {
//        return quizService.getQuizQuestions(id);
//    }
	
//	@PostMapping("/submitQuiz/{id}")
//    public Integer submitQuiz(@PathVariable Long id, @RequestBody List<Response> responses) {
//        return quizService.calculateResult(id, responses);
//    }

}
