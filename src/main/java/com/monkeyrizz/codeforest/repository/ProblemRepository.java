package com.monkeyrizz.codeforest.repository;

import com.monkeyrizz.codeforest.model.Problem;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProblemRepository extends CrudRepository<Problem, Integer> {
    Problem findById(Long problemId);
    List<Problem> findAll();
}
