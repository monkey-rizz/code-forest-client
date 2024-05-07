package com.monkeyrizz.codeforest.service;

import com.monkeyrizz.codeforest.model.Problem;
import com.monkeyrizz.codeforest.repository.ProblemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
import java.util.Optional;

@Service
public class ProblemService {

    private ProblemRepository repo;

    @Autowired
    public ProblemService(ProblemRepository repo) {
        this.repo = repo;
    }

    public List<Problem> getProblems() {
        return repo.findAll();
    }

    public Problem getProblemById(Long problemId) {
        return repo.findById(problemId);
    }
}
