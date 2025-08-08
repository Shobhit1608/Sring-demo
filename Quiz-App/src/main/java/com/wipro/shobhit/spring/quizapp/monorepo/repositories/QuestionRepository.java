package com.wipro.shobhit.spring.quizapp.monorepo.repositories;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.wipro.shobhit.spring.quizapp.monorepo.entities.Question;
import com.wipro.shobhit.spring.quizapp.monorepo.enums.Category;



@Repository
public interface QuestionRepository extends JpaRepository<Question, Long> {
  
  
	@Query(value = "SELECT * FROM question_db q " +
            "WHERE q.category = :category " +
            "AND q.difficulty_level = :level " +
            "ORDER BY RANDOM() LIMIT 5", 
    nativeQuery = true)
	List<Question> findRandomByCategoryAndDifficulty(String category, String level);
	List<Question> findByCategory(Category category);
	
}

