package com.monkeyrizz.codeforest.controller;

import com.monkeyrizz.codeforest.model.Problem;
import com.monkeyrizz.codeforest.service.ProblemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
    @RequestMapping(path = "all")
    public List<Problem> getProblems() {
        return problemService.getProblems();
    }

    @GetMapping
    @RequestMapping(path = "{problemId}")
    public Problem getProblemById(@PathVariable Long problemId) {
        return problemService.getProblemById(problemId);
    }


}
