package com.monkeyrizz.codeforest.controller;

import com.monkeyrizz.codeforest.dto.Problem;
import com.monkeyrizz.codeforest.service.ProblemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "problem")
public class ProblemController {
    private final ProblemService problemService;

    @Autowired
    public ProblemController(ProblemService problemService) {
        this.problemService = problemService;
    }

    @GetMapping
    @RequestMapping(path = "")
    public List<Problem> getProblems() {
        return problemService.getProblems();
    }
}
