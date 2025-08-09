package com.wipro.shobhit.microservices.questionservices.entities;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class Response {
    private final int id; 
    private final String userAnswer; 
}
