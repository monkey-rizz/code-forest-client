package com.monkeyrizz.codeforest.controller;

import com.monkeyrizz.codeforest.model.Solution;
import com.monkeyrizz.codeforest.service.SolutionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "solution")
public class SolutionController {
    private final SolutionService solutionService;

    @Autowired
    public SolutionController(SolutionService solutionService) {
        this.solutionService = solutionService;
    }

    @GetMapping
    @RequestMapping(path="{solutionId}")
    public Solution getSolutionById(@PathVariable Long solutionId) {
        return solutionService.getSolutionById(solutionId);
    }

}
