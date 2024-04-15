package com.monkeyrizz.codeforest.service;

import com.monkeyrizz.codeforest.model.Solution;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SolutionService {
    public List<Solution> getSolutionList(Long problemId) {
        return List.of(
                new Solution(
                        "twosum",
                        "return the two numbers that add up to a sum",
                        2L,
                        problemId
                )
        );
    }
}
