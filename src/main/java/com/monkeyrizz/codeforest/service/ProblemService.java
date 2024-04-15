package com.monkeyrizz.codeforest.service;

import com.monkeyrizz.codeforest.model.Problem;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Service
public class ProblemService {
    @GetMapping
    public List<Problem> getProblems() {
        return List.of(
                new Problem(
                        "twosum",
                        "return the two numbers that add up to a sum",
                        2L
                )
        );
    }
    public Problem getProblemById(int id) {
        return new Problem(
                "problem by ID",
                "problem description by ID: " + String.valueOf(id),
                3L
        );
    }
}
