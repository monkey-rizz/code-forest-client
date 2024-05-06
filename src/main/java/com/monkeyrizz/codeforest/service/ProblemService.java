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
        return List.of(
                new Problem(
                        "twosum",
                        "return the two numbers that add up to a sum",
                        2L
                )
        );
    }

    public Problem getProblemById(int id) {
        return repo.findById(id);
    }
}
