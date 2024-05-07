package com.monkeyrizz.codeforest.service;

import com.monkeyrizz.codeforest.model.Solution;
import com.monkeyrizz.codeforest.repository.SolutionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SolutionService {

    private SolutionRepository repo;

    @Autowired
    public SolutionService(SolutionRepository repo) {
        this.repo = repo;
    }


    public Solution getSolutionById(Long solutionId) {
        return repo.findById(solutionId);
    }

    public List<Solution> getSolutionList(Long problemId) {
        return repo.findAll();
    }
}
