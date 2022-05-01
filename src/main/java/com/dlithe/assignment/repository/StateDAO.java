package com.dlithe.assignment.repository;

import com.dlithe.assignment.entity.State;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StateDAO extends JpaRepository<State, Integer> {
}
