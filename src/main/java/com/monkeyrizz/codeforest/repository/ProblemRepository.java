package com.monkeyrizz.codeforest.repository;

import com.monkeyrizz.codeforest.model.Problem;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProblemRepository extends CrudRepository<Problem, Integer> {

}
