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
    @RequestMapping(path = "list")
    public List<Problem> getProblems() {
        return problemService.getProblems();
    }

    @GetMapping
    @RequestMapping(path = "{id}")
    public Problem getProblemById(@PathVariable int id) {
        return problemService.getProblemById(id);
    }


}
