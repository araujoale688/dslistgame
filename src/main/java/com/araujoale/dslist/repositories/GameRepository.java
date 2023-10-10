package com.araujoale.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.araujoale.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {
}