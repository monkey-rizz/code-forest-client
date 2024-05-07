package com.monkeyrizz.codeforest.repository;

import com.monkeyrizz.codeforest.model.Solution;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SolutionRepository extends CrudRepository<Solution, Integer> {
    Solution findById(Long solutionId);
    List<Solution> findAll();
}

