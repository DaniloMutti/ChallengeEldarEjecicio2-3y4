package ar.com.eldar.eldarchallenge.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import ar.com.eldar.eldarchallenge.exception.ChallengeException;

@RestControllerAdvice
public class ChallengeExceptionHandler {
    
    @ExceptionHandler(ChallengeException.class)
    @ResponseStatus(value = HttpStatus.BAD_REQUEST)
    public String apiException(ChallengeException challengeException){
        return challengeException.getMessage();
    }
}
